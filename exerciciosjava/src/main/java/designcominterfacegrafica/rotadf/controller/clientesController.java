package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Cliente;
import designcominterfacegrafica.rotadf.util.ScreenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class clientesController implements Initializable {
    @FXML
    private TableView<Cliente> tblCliente;
    @FXML
    private TableColumn<Cliente, String> colNome;
    @FXML
    private TableColumn<Cliente, String> colCpf;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        carregarClientes();
    }

    private void carregarClientes() {
        List<Cliente> lista = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("clientes.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    lista.add(new Cliente(partes[0].trim(), partes[1].trim()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tblCliente.getItems().setAll(lista);
    }

    @FXML
    private void cadastrarCliente() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/modalNovoClienteView.fxml"));
        Parent root = loader.load();

        modalNovoClienteController controller = loader.getController();

        Stage stage = new Stage();
        stage.setTitle("Cadastrar Cliente");
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        carregarClientes();
    }

    @FXML
    private void sair() {
        ScreenController.changeScene("/menuView.fxml");
    }

}

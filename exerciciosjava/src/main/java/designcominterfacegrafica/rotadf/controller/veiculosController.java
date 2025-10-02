package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Veiculo;
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

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class veiculosController implements Initializable {

    @FXML
    private TableView<Veiculo> tblVeiculos;
    @FXML
    private TableColumn<Veiculo, String> colModelo;
    @FXML
    private TableColumn<Veiculo, String> colPlaca;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));
        carregarVeiculos();
    }

    private void carregarVeiculos() {
        List<Veiculo> lista = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("veiculos.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    lista.add(new Veiculo(partes[0].trim(), partes[1].trim()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        tblVeiculos.getItems().setAll(lista);
    }


    @FXML
    private void cadastrarVeiculo() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/modalNovoVeiculoView.fxml"));
        Parent root = loader.load();

        modalNovoVeiculoController controller = loader.getController();

        Stage stage = new Stage();
        stage.setTitle("Cadastrar Veículo");
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        carregarVeiculos();
    }

    @FXML
    private void sair() {
        ScreenController.changeScene("/menuView.fxml");
    }
}

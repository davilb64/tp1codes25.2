package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Motorista;
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

public class motoristasController implements Initializable {

    @FXML
    private TableView<Motorista> tblMotoristas ;
    @FXML
    private TableColumn<Motorista, String> colNome;
    @FXML
    private TableColumn<Motorista, String> colCnh;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colCnh.setCellValueFactory(new PropertyValueFactory<>("cnh"));
        carregarMotoristas();
    }

    private void carregarMotoristas() {
        List<Motorista> lista = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("motoristas.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    lista.add(new Motorista(partes[0].trim(), partes[1].trim()));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        tblMotoristas.getItems().setAll(lista);
    }


    @FXML
    private void cadastrarMotorista() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/modalNovoMotoristaView.fxml"));
        Parent root = loader.load();

        modalNovoMotoristaController controller = loader.getController();

        Stage stage = new Stage();
        stage.setTitle("Cadastrar Veículo");
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        carregarMotoristas();
    }

    @FXML
    private void sair() {
        ScreenController.changeScene("/menuView.fxml");
    }


}

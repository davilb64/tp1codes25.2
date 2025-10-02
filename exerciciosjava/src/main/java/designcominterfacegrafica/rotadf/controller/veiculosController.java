package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Veiculo;
import designcominterfacegrafica.rotadf.util.ScreenController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class veiculosController {
    @FXML
    private TableView<Veiculo> tblVeiculos;
    @FXML
    private TableColumn<Veiculo, String> colModelo;
    @FXML
    private TableColumn<Veiculo, String> colPlaca;


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

    }

    @FXML
    private void sair() {
        ScreenController.changeScene("/menuView.fxml");
    }
}

package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.*;
import designcominterfacegrafica.rotadf.util.ScreenController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class chamadosController implements Initializable {
    @FXML
    private TableView<Chamado> tblChamado;
    @FXML
    private TableColumn<Chamado, Integer> colId;
    @FXML
    private TableColumn<Chamado, TipoChamado> colTipo;
    @FXML
    private TableColumn<Chamado, String> colData;
    @FXML
    private TableColumn<Chamado, String> colOrigem;
    @FXML
    private TableColumn<Chamado, String> colDestino;
    @FXML
    private TableColumn<Chamado, String> colPartida;
    @FXML
    private TableColumn<Chamado, String> colChegada;
    @FXML
    private TableColumn<Chamado, Double> colDistancia;
    @FXML
    private TableColumn<Chamado, Cliente> colCLiente;
    @FXML
    private TableColumn<Chamado, Veiculo> colVeiculo;
    @FXML
    private TableColumn<Chamado, Motorista> colMotorista;

    Chamado chamado;

    @FXML
    private void carregarChamado(){

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(new PropertyValueFactory<>("codigoChamado"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipoChamado"));
        colData.setCellValueFactory(new PropertyValueFactory<>("data"));
        colOrigem.setCellValueFactory(new PropertyValueFactory<>("origem"));
        colDestino.setCellValueFactory(new PropertyValueFactory<>("destino"));
        carregarChamado();
    }

    @FXML
    private void voltar(){
        ScreenController.changeScene("/menuView.fxml");
    }
}

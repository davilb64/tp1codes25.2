package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Veiculo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class modalNovoVeiculoController {
    @FXML
    private TextField lblModelo;

    @FXML
    private TextField lblPlaca;

    private Veiculo veiculo;

    @FXML
    private void salvarVeiculo() {
        this.veiculo = new Veiculo(lblModelo.getText(), lblPlaca.getText());
        fecharJanela();
    }

    @FXML
    private void fecharJanela() {
        Stage stage = (Stage) lblModelo.getScene().getWindow();
        stage.close();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}

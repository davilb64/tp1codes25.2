package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Veiculo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;

public class modalNovoVeiculoController {
    @FXML
    private TextField lblModelo;

    @FXML
    private TextField lblPlaca;

    private Veiculo veiculo;

    @FXML
    private void salvarVeiculo() throws IOException {
        this.veiculo = new Veiculo(lblModelo.getText(), lblPlaca.getText());

        try (FileWriter escrita = new FileWriter("veiculos.csv", true)) {
            escrita.write(veiculo.getModelo() + ";" + veiculo.getPlaca() + "\n");
        }

        fecharJanela();
    }

    @FXML
    private void fecharJanela() {
        Stage stage = (Stage) lblModelo.getScene().getWindow();
        stage.close();
    }
}

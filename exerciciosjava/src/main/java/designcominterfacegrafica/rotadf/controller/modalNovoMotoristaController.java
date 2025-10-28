package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Motorista;
import designcominterfacegrafica.rotadf.Veiculo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;

public class modalNovoMotoristaController {
    @FXML
    private TextField lblCnh;

    @FXML
    private TextField lblNome;

    private Motorista motorista;

    @FXML
    private void salvarMotorista() throws IOException {
        this.motorista = new Motorista(lblNome.getText(), lblCnh.getText());

        try (FileWriter escrita = new FileWriter("motoristas.csv", true)) {
            escrita.write(motorista.getNome() + ";" + motorista.getCnh() + "\n");

        }

        fecharJanela();
    }

    @FXML
    private void fecharJanela() {
        Stage stage = (Stage) lblNome.getScene().getWindow();
        stage.close();
    }

}

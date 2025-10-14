package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.Cliente;
import designcominterfacegrafica.rotadf.Veiculo;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.IOException;

public class modalNovoClienteController {
    @FXML
    private TextField lblNome;

    @FXML
    private TextField lblCpf;

    private Cliente cliente;

    @FXML
    private void salvarCliente() throws IOException {
        this.cliente = new Cliente(lblNome.getText(), lblCpf.getText());

        try (FileWriter escrita = new FileWriter("clientes.csv", true)) {
            escrita.write(cliente.getNome() + ";" + cliente.getCpf() + "\n");
        }

        fecharJanela();
    }

    @FXML
    private void fecharJanela() {
        Stage stage = (Stage) lblNome.getScene().getWindow();
        stage.close();
    }
}

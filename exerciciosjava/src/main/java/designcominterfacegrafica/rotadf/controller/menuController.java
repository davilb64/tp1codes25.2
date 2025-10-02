package designcominterfacegrafica.rotadf.controller;

import designcominterfacegrafica.rotadf.util.ScreenController ;
import javafx.fxml.FXML;

public class menuController {
    @FXML
    private void entrarChamados() {
        ScreenController.changeScene("/chamadosView.fxml");
    }

    @FXML
    private void entrarClientes() {
        ScreenController.changeScene("/clientesView.fxml");
    }

    @FXML
    private void entrarVeiculos() {
        ScreenController.changeScene("/veiculosView.fxml");
    }

    @FXML
    private void entrarMotoristas() {
        ScreenController.changeScene("/motoristasView.fxml");
    }

}

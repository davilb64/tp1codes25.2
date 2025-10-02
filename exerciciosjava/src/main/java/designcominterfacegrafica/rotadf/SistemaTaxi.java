package designcominterfacegrafica.rotadf;

import designcominterfacegrafica.rotadf.util.ScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SistemaTaxi extends Application {


    @Override
    public void start(Stage stage) {
        ScreenController.setStage(stage);
        ScreenController.changeScene("/menuView.fxml");
        stage.setTitle("Sistema de Táxi");// Tela inicial
    }

    public static void main(String[] args) {
        launch(args);
    }
}

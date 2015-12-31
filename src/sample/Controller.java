package sample;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Controller {

    public void Exit(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Apagar Pokedex");
        alert.setHeaderText("Seguro que quires apagar la pokedex y salir?");
        alert.setContentText("Pulsa Acptar para salir.\nPulsa Cancelar para volver a la pokedex.");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            Platform.exit();
        }
    }

}

package sample;

import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.util.Optional;

public class Controller {
    public ImageView IVsprite;
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
    public void Info(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
        alert.showAndWait();
    }
}

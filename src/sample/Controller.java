package sample;

import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.Optional;

public class Controller {
    public ImageView IVsprite;
    public Button BTinfo;
    public Button BTapagar;
    public Button BTrandom;
    public TextField TFescribirPokemon;
    public MenuButton MBseleccionarPokemon;
    public GridPane GPpropiedades;
    public Text TnombreFijo;
    public Text TpesoFijo;
    public Text TalturaFijo;
    public Text TtipoFijo;
    public Text TataquePrincipalFijo;
    public Text TnombreVariable;
    public Text TpesoVariable;
    public Text TalturaVariable;
    public Text TtipoVariable;
    public Text TataquePrincipalVariable;
    public ScrollBar SBzoom;
    public Button BTbuscar;
    public Button BTreset;


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
    public void Reset(){
        TFescribirPokemon.clear();
        TnombreVariable.setText("");
        TpesoVariable.setText("");
        TalturaVariable.setText("");
        TtipoVariable.setText("");
        TataquePrincipalVariable.setText("");
        MBseleccionarPokemon.setText("Selecciona un Pokemon");
    }
    public void prueba (){
        MBseleccionarPokemon.setText("Hola");
        TFescribirPokemon.setText("Hola");
    }
}

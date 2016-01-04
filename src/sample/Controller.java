package sample;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.json.JSONException;

import java.io.IOException;
import java.util.Optional;
import java.util.Random;

public class Controller extends Datos {
    public Button BTinfo;
    public Button BTapagar;
    public Button BTrandom;
    public GridPane GPpropiedades;
    public Text TnombreFijo;
    public Text TpesoFijo;
    public Text TalturaFijo;
    public Text TtipoFijo;
    public Text TespecieFijo;
    public ScrollBar SBzoom;
    public Button BTbuscar;
    public Button BTreset;


    public void Exit(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:src\\sample\\imagenes\\icono_alert.png"));
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
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:src\\sample\\imagenes\\icono_alert.png"));
        alert.setTitle("Informacion");
        alert.setHeaderText("Pokedex de I generacion");
        alert.setContentText("Pokedex de la pimera generacion con los 151 pokemons originales." +
                "\nSe necesita conexion a internet para poder ver la informacion referente a los pokemons." +
                "\nPrograma creado por oscarXIII");
        alert.showAndWait();
    }
    public void Random() throws IOException, JSONException {
        Random rand = new Random();
        int ran = rand.nextInt(151);
        ID = String.valueOf(ran);
        LlamadaApi();
        System.out.println(ID);
        MBseleccionarPokemon.setText(obj.getString("name"));
    }
}

package sample;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.json.JSONException;

import java.io.IOException;
import java.net.IDN;
import java.net.URI;
import java.net.URISyntaxException;
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
    public Slider SBzoom;
    public Button BTbuscar;
    public Button BTreset;

    public int IDnum;

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
    public void Cerrar(){
        System.exit(0);
    }
    public void Info(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:src\\sample\\imagenes\\icono_alert.png"));
        alert.setTitle("Informacion");
        alert.setHeaderText("Pokedex de I generacion");
        alert.setContentText("Pokedex de la pimera generacion con los 151 pokemons originales." +
                "\nSe necesita conexion a internet para poder ver la informacion referente a los pokemons." +
                "\nPara saber como funciona y que hace cada boton, presiona el boton verde de arriba a la iquierda." +
                "\nSe necesita conexion a internet para poder ver la informacion referente a los pokemons." +
                "\nPara ver la API al completo dale al boton \"PokeApi.co\", " +
                "\nte redirigira a la pagina:\t\thttp://pokeapi.co/" +
                "\n\n\tPrograma creado por oscarXIII");
        ButtonType buttonTypeThree = new ButtonType("PokeApi.co");
        ButtonType buttonTypeCancel = new ButtonType("Aceptar", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(buttonTypeThree, buttonTypeCancel);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeThree){
            URI u = null;
            try {
                u = new URI("http://pokeapi.co/");
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
            try {
                java.awt.Desktop.getDesktop().browse(u);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    public void Manual(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:src\\sample\\imagenes\\icono_alert.png"));
        alert.setTitle("Manual botones Pokedex");
        alert.setHeaderText(null);
        alert.setContentText("Boton rojo arriba, cierra la pokedex." +
                "\nBoton amarillo arriba, minimiza la pokedex." +
                "\nBoton verde arriba, abre este dialogo de informacion." +
                "\nBoton azul abajo, resetea el zoom al estado inicial." +
                "\nBotones grises con flechas opuestas, cambian entre pokemon ver el siguiente o el anterior." +
                "\nBoton amarillo con flecha roja, limpia toda la informacion que se esta mostrando en la pokedex.");

        alert.showAndWait();
    }
    public void Minimizar(){
        Stage stage = (Stage) Main.scena.getScene().getWindow();
        stage.setIconified(true);
    }
    public void Random() throws IOException, JSONException {
        Random rand = new Random();
        int ran = rand.nextInt(151);
        ID = String.valueOf(ran);
        LlamadaApi();
        System.out.println(ID);
        MBseleccionarPokemon.setText(obj.getString("name"));
    }
    public void SiguientePokemon() throws IOException, JSONException {
        if (ID==""){
            ID ="0";
        }
        IDnum = Integer.parseInt(ID);
        int IDsig = IDnum + 1;
        if (IDsig > 151){
            IDsig=151;
        }
        ID = String.valueOf(IDsig);
        LlamadaApi();
        System.out.println(ID);
        MBseleccionarPokemon.setText(obj.getString("name"));
    }
    public void AnteriorPokemon() throws IOException, JSONException {
        if (ID==""){
            ID ="1";
        }
        IDnum = Integer.parseInt(ID);
        int IDant = IDnum - 1;
        if (IDant < 1){
            IDant=1;
        }
        ID = String.valueOf(IDant);
        LlamadaApi();
        System.out.println(ID);
        MBseleccionarPokemon.setText(obj.getString("name"));
    }
    public void initialize() {
        IVsprite.setFitWidth(120D);
        IVsprite.setFitHeight(120D);
        SBzoom.setValue(120D);
        SBzoom.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                IVsprite.setFitWidth(newValue.intValue());
                IVsprite.setFitHeight(newValue.intValue());
            }
        });
    }
}

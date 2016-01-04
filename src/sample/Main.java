package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    public static Stage scena;
    @Override
    public void start(Stage primaryStage) throws Exception{
        scena = primaryStage;
        scena.getIcons().add(new Image("file:src\\sample\\imagenes\\icono_tray.png"));
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.setStyle("-fx-background-color: transparent;");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(new Scene(root, 600, 400, Color.TRANSPARENT));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

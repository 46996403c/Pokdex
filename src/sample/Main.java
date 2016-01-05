package sample;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private static class Delta {
        double x, y;
    }
    final Delta dragDelta = new Delta();
    final BooleanProperty inDrag = new SimpleBooleanProperty(false);

    public static Stage scena;

    @Override
    public void start(Stage primaryStage) throws Exception{
        scena = primaryStage;
        scena.getIcons().add(new Image("file:src\\sample\\imagenes\\icono_tray.png"));
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.setStyle("-fx-background-color: transparent;");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(new Scene(root, 600, 400, Color.TRANSPARENT));

        root.setOnMousePressed(event -> {
            dragDelta.x = primaryStage.getX() - event.getScreenX();
            dragDelta.y = primaryStage.getY() - event.getScreenY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() + dragDelta.x);
            primaryStage.setY(event.getScreenY() + dragDelta.y);
            primaryStage.getWidth();
            primaryStage.getHeight();
            primaryStage.getX();
            primaryStage.getY();
            inDrag.set(true);
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

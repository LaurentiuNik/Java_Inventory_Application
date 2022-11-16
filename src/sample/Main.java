package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        primaryStage.setTitle("EH Inventory");
        primaryStage.setScene(new Scene(root, 410, 541));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

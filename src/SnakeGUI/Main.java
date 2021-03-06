// Magnus Johannsen EC2 Exam

package SnakeGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("JakeGame");

        Scene scene = new Scene(root, 600,400);

        primaryStage.setScene(scene);
        primaryStage.getScene().getStylesheets().add("SnakeGUI/stylesheet.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

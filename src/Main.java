import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);

        System.out.println("Nice job Team One!");
        //Connection con = DB_Connector.connect();
    }

    @Override
    public void start(Stage primaryStage) {

        // Laver et objekt af klassen ÅbenVindue
        ÅbenVindue åbenVindue = new ÅbenVindue();


        åbenVindue.kontonavnGUI(primaryStage);

    }

}
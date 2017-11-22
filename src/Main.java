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
        try {
            // Indlæser en fxml fil
            Parent root = FXMLLoader.load(getClass().getResource("GUI/KontonavnGUI.fxml"));

            // Laver en scene med FXML filen
            Scene scene = new Scene(root);

            // Sætter vinduet titel til Kontoejer
            primaryStage.setTitle("Kontoejer");
            // Sætter scenen
            primaryStage.setScene(scene);
            // Viser den
            primaryStage.show();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
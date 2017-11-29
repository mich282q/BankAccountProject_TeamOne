import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main extends Application {

    public static void main(String[] args) throws SQLException {
        //launch(args);

        System.out.println("Nice job Team One!");


        Bruger.insertBrugerData();

        Konto.insertKontoData();


        Konto saldo = new Konto();
        saldo.insertSaldoData(500,582102093, 5325, 697564654, 1520);


        // Afslutter programmet efter testen er kørt
        System.exit(0);
    }


    @Override
    public void start(Stage primaryStage) {

        // Laver et objekt af klassen ÅbenVindue
        //ÅbenVindue åbenVindue = new ÅbenVindue();


        //åbenVindue.kontonavnGUI(primaryStage);

    }



}
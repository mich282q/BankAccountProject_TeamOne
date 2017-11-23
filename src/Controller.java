import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private Button btnGennemfoerOverfoersel;
    @FXML
    private TextField txtBeloeb;
    @FXML
    private MenuItem miAction1; //Overfør fra
    @FXML
    private MenuItem miAction2; //Overfør fra
    @FXML
    private MenuItem miAction3; //Overfør til
    @FXML
    private MenuItem miAction4; //Overfør til
    @FXML
    private TableView tableView;


    @FXML
    private void handleButtonAction(javafx.event.ActionEvent e) {
        int beloeb; //det indtastede beløb i textfield

        beloeb=Integer.parseInt(txtBeloeb.getText()); //Læser det beløb man har indtastet i beløbsfeltet

        if(e.getSource() == btnGennemfoerOverfoersel) { //Køres hvis den valgte knap bliver valgt
            System.out.println("Knappen virker og der er sendt " + beloeb + " kr.");

            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Dit beløb på " + beloeb + "kr er " +
                    "overført til den valgte konto."); //Pop-up vindue som sender en tekst


        }

    }

}

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private Button btnGennemfoerOverfoersel;
    @FXML
    private TextField txfBeloeb;
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
        if(e.getSource() == btnGennemfoerOverfoersel) {
            System.out.println("Knappen virker :-)");

        }

    }

}

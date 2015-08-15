package ButtonsEvents_3;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by akshayrajgollahalli on 15/08/15.
 */

// set it as an Initializable for JavaFX
public class controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // ignore this for now, but this is a must
    }

    // Function to call when button is clicked
    public void printOut(ActionEvent event){
        System.out.println("Hello World");
    }
}
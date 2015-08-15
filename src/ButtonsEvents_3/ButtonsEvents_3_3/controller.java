package ButtonsEvents_3.ButtonsEvents_3_3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * Created by akshayrajgollahalli on 15/08/15.
 */

public class controller{

    @FXML // makes private field visible to FXML loader
    private Button myButton;

    @FXML
    private Text myText;

    @FXML
    private void initialize(){
        // if button is clicked run this event
        myButton.setOnAction((event) -> {
            myText.setText("Hello World");
        });
    }
}
package ReadingTextField_5.ReadingTextField_5_2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * Created by akshayrajgollahalli on 15/08/15.
 */

public class controller{

    @FXML // makes private field visible to FXML loader
    private Button myButton;

    @FXML
    private TextField myTextField;

    @FXML
    private Text myText;

    @FXML
    private void initialize(){
        // if button is clicked run this event
        myButton.setOnAction((event) -> {
            String newText = myTextField.getText();
            myText.setText(newText);
        });
    }
}
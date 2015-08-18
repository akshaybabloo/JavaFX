package CustomFonts_8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by akshayrajgollahalli on 15/08/15.
 */

// set it as an Initializable for JavaFX
public class controller {
    @FXML
    private Button button1;
    @FXML
    private Button button2;

    @FXML
    private void initialize() {

        // loading font file
        Font f1 = Font.loadFont(getClass().getResourceAsStream("fontawesome-webfont.ttf"), 20);
        button1.setFont(f1); // setting the font family to the button.
        button1.setText('\uf040' +""); // setting the unicode

        Font f2 = Font.loadFont(getClass().getResourceAsStream("TRON.TTF"), 20);
        button2.setFont(f2);
        button2.setText("hello!"); // non-unicode


    }



    // Function to call when button is clicked
//    public void printOut(ActionEvent event){
//        System.out.println("Hello World");
//    }
}
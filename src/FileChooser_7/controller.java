package FileChooser_7;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;


/**
 * Created by akshayrajgollahalli on 15/08/15.
 */

public class controller{

    @FXML
    private TextField myText;

    @FXML
    private Button browse;
    private Window primaryStage;


    @FXML
    private void initialize(){


        // print on GUI
        browse.setOnAction((event) -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(primaryStage);
            String fileName = String.valueOf(file);
            myText.setText(fileName);
        });

    }


}
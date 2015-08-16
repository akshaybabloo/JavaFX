package Menu_6;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;


/**
 * Created by akshayrajgollahalli on 15/08/15.
 */

public class controller{

    @FXML
    private MenuItem printGui;

    @FXML
    private MenuItem printConsole;

    @FXML
    private MenuItem quit;

    @FXML
    private Label myText;

    @FXML
    private MenuBar myMenuBar;

//    @FXML
//    private SeparatorMenuItem sep;

    @FXML
    private void initialize(){

        // get the os name
        String os = System.getProperty("os.name");
        // check to see if the os is mac
        if (os != null && os.startsWith("Mac")){
            myMenuBar.useSystemMenuBarProperty().set(true); // if its mac then let the menu bar be native
        }

        // print on GUI
        printGui.setOnAction((event) -> {
            myText.setText("Text on GUI");
        });

        // print on console
        printConsole.setOnAction((event) ->{
            System.out.println("Text on console");
        });

        // exit GUI
        quit.setOnAction((event) ->{
            Platform.exit();
        } );
    }
}
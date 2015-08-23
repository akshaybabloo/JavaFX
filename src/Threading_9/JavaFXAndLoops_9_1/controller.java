package Threading_9.JavaFXAndLoops_9_1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Created by akshayrajgollahalli on 15/08/15.
 */

public class controller {

    @FXML
    private Button start;
    @FXML
    private Button stop;

    @FXML
    private void initialize() {
        looper hi = new looper();

        start.setOnAction(event -> {
            hi.looper1();
        });

        stop.setOnAction(event -> {
            hi.s();
        });
    }
}
package ReadingTextField_5.ReadingTextField_5_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by akshayrajgollahalli on 14/08/15.
 */
public class main extends Application {

    public static void main(String[] args){
        launch(args); // renders the GUI window
    }

    // this is where you write the code for JavaFX
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/ReadingTextField_5/ReadingTextField_5_2/Main.fxml"));
        Scene scene = new Scene(root, 284, 113); // scene is the child of root node with dimensions on width*height

        primaryStage.setResizable(false);
        primaryStage.setScene(scene); // start te scene
        primaryStage.setTitle("Hello World"); // the title of the scene
        primaryStage.show(); // show the rendered scene

    }
}

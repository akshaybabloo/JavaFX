package Threading_9.JavaFXAndLoops_9_1;


import javafx.application.Platform;

import java.util.Timer;
import java.util.TimerTask;


public class looper {


    Timer timer = new Timer();


    public String looper1() {

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    System.out.println("hi");
                });
            }
        }, 1, 2000);

        return null;
    }

    public void s() {
        timer.cancel();
        timer.purge();
    }

}

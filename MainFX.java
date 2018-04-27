import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Kyle M. Shive    
 * zyLab-08
 * CS 150 - 001
 * 10/31/2017
 * 
 * Below is the main class which is an extension of application, it runs the calendar frame to display
 * the month of October
 * 
 */
public class MainFX extends Application {
        
    @Override
    public void start(Stage primaryStage) {
        //create the scene
        // populate the scene
        primaryStage.setScene(new Scene( new Calendar(), 580, 580 ) );
        // set the scene title
        primaryStage.setTitle("Calendar");
        // show stage
        primaryStage.show();
    }// end override to set primary stage
    
    public static void main(String[] args) {
        Application.launch(args);
    }// end main method
}// end class

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 * Kyle M. Shive    
 * zyLab-08
 * CS 150 - 001
 * 10/31/2017
 * 
 * Below is the calendar borderPane which draws the UI for the display of the month of October
 * 
 * NOTES Use of POSITIVE_INFINITY and NEGATIVE_INFINITY are to fully fill label boundaries of each cell
 */
public class Calendar extends BorderPane {
    public static final int FRAMES = 35;
    public static final String[] weekDays = {"S","M","T","W","T","F","S"};
    
    GridPane grid = new GridPane();                 // create gridPane for center
    
    public Calendar() {
        buildUI();
        customizeUI();
    }// end ctr
    
    public void buildUI() {
        HBox hbox = new HBox();                     // create Hbox
        hbox.setPadding(new Insets(20,20,40,255) ); // centers month name over Grid
        Label month = new Label ("October");        // create october label
        month.setStyle("-fx-font: 18 px;");
        
        this.setTop(hbox);                          // set hbox to top of borderPane
        hbox.getChildren().addAll(month);           // add month to hbox
                
        this.setCenter(grid);                       // add gridPane to center of BorderPane
        
        grid.setPadding(new Insets(10,20,20,20) );  // add insets to gridPane for aesthetic
        
       
        
    }// end build UI
    
    public void customizeUI() {
        
        for (int i = 0; i <= weekDays.length - 1; i++) {
            Label daysOfWeek = new Label(weekDays[i]);
            daysOfWeek.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY); // to fill entirity of label cells as mentioned above in notes
            grid.add(daysOfWeek, i + 1, 1);
            daysOfWeek.setPadding(new Insets(15,30,25,30) );
            daysOfWeek.setStyle("-fx-text-fill: white;" + "-fx-font: 13 px;" +
                         "-fx-background-color: green;" + "-fx-border-color: black;"); // style here set so each cell that is build throughout the loop receives the benefits of the style 
            
            
          
        }// end for loop to cycle through days of week 
        
        for (int i = 1; i <= FRAMES; i++) {
            int yPos = ((i - 1) / 7) + 2;       // algorithm to set x and y position in the loop, 7 days a week,
            int xPos = i - (7 * (yPos -2) );
            
            if (i < 32) {
                Label monthDays = new Label(String.valueOf(i) );
                monthDays.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
                grid.add(monthDays, xPos, yPos);
                monthDays.setPadding(new Insets(25,30,25,30) );
                monthDays.setStyle("-fx-font-weight: bold;" + "-fx-border-color: black;" + "-fx-font: 13 px;");
            } else if (i > 32) {
               // below creating november labels
                Label nov1 = new Label("1");
                grid.add(nov1, 4, 6);
                nov1.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
                Label nov2 = new Label("2");
                grid.add(nov2, 5, 6);
                nov2.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
                Label nov3 = new Label("3");
                grid.add(nov3, 6, 6);
                nov3.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
                Label nov4 = new Label("4");
                grid.add(nov4, 7, 6);
                nov4.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
                // below padding and making borders for labels for november
                // below must be customized in loop to take effect on each label
                nov1.setPadding(new Insets(25,30,25,30) );
                nov1.setStyle("-fx-font-weight: bold;" + "-fx-font: 13 px;" +"-fx-text-fill: white;" + "-fx-border-color: black;" + "-fx-background-color: grey;");
                nov2.setPadding(new Insets(25,30,25,30) );
                nov2.setStyle("-fx-font-weight: bold;" + "-fx-font: 13 px;" + "-fx-text-fill: white;" + "-fx-border-color: black;" + "-fx-background-color: grey;");
                nov3.setPadding(new Insets(25,30,25,30) );
                nov3.setStyle("-fx-font-weight: bold;" + "-fx-font: 13 px;" + "-fx-text-fill: white;" + "-fx-border-color: black;" + "-fx-background-color: grey;");
                nov4.setPadding(new Insets(25,30,25,30) );
                nov4.setStyle("-fx-font-weight: bold;" + "-fx-font: 13 px;" + "-fx-text-fill: white;" + "-fx-border-color: black;" + "-fx-background-color: grey;");
                
               
              
            }// end if else for looping days of the month 
            
        }// end for loop to cycle through days of month 
        
    }// end UI
    
}// end class calendar
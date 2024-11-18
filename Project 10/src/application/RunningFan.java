/*
 * Class: CMSC214 
 * Instructor: Mark R. Estep
 * Description: (Give a brief description for each Program)
 * Due: 11/19/23
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ben Amon-Kotey
*/

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RunningFan extends Application {

    public void start(Stage primaryStage) {

        HBox hBox = new HBox(5);
        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        Button btReverse = new Button("Reverse");

        FanPane fan = new FanPane();

        // Set actions for buttons
        btPause.setOnAction(e -> fan.pauseRotation());
        btResume.setOnAction(e -> fan.resumeRotation());
        btReverse.setOnAction(e -> fan.reverseRotation());

        hBox.getChildren().addAll(btPause, btResume, btReverse);

        BorderPane pane = new BorderPane();
        pane.setTop(hBox); 
        pane.setCenter(fan); 

        Scene scene = new Scene(pane, 200, 220);
        primaryStage.setTitle("Running Fan");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

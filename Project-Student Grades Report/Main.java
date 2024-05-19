/**
 Program prompts the user to enter the name, Age and score for 4 subjects
 calculate  letter grades for each subject
 calculate final grades
 @assignment  CSCI 428  Project
 @date 04/28/2024
 Name: Ashish Acharya
 CWID: 50337433
 **/

package project.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 700);
        stage.setTitle("Student Grading System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

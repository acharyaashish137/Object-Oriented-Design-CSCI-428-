package CSCI428Lab01Fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Registration System");

        Label totalStudentsLabel = new Label("Total Students: 0");

        int[] totalStudents = {0}; // Using an array to store total students as a reference

        Button addStudentBtn = new Button("Add Student");
        addStudentBtn.setOnAction(e -> {
            totalStudents[0]++;
            totalStudentsLabel.setText("Total Students: " + totalStudents[0]);
            System.out.println("Student added successfully!");
        });

        Button deleteStudentBtn = new Button("Delete Student");
        deleteStudentBtn.setOnAction(e -> {
            if (totalStudents[0] > 0) {
                totalStudents[0]--;
                totalStudentsLabel.setText("Total Students: " + totalStudents[0]);
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("No students to delete!");
            }
        });

        Button showTotalBtn = new Button("Show Total Students");
        showTotalBtn.setOnAction(e -> {
            System.out.println("Total Students: " + totalStudents[0]);
        });

        Button quitBtn = new Button("Quit");
        quitBtn.setOnAction(e -> {
            System.out.println("Exiting program...");
            primaryStage.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(totalStudentsLabel, addStudentBtn, deleteStudentBtn, showTotalBtn, quitBtn);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

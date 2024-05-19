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

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML private TextField studentNameField;
    @FXML private TextField studentAgeField;
    @FXML private Label resultLabel;

    // Fields for 4 subjects
    @FXML private TextField scoreField1, scoreField2, scoreField3, scoreField4;

    @FXML
    protected void onCalculateButtonClick() {
        try {
            String name = studentNameField.getText();
            int age = Integer.parseInt(studentAgeField.getText());

            List<SubjectScore> scores = new ArrayList<>();
            scores.add(new SubjectScore("Subject 1", Integer.parseInt(scoreField1.getText())));
            scores.add(new SubjectScore("Subject 2", Integer.parseInt(scoreField2.getText())));
            scores.add(new SubjectScore("Subject 3", Integer.parseInt(scoreField3.getText())));
            scores.add(new SubjectScore("Subject 4", Integer.parseInt(scoreField4.getText())));

            Student student = new Student(name, age);
            GradeReport gradeReport = new GradeReport(student, scores);

            resultLabel.setText(gradeReport.generateReport());
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid numbers for age and scores.");
        } catch (Exception e) {
            resultLabel.setText("An error occurred: " + e.getMessage());
        }
    }
}

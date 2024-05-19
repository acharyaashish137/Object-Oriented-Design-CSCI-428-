package project.project;

import java.util.List;
import java.util.stream.Collectors;

public class GradeReport {
    // Fields for storing student and their subject scores
    private Student student;
    private List<SubjectScore> subjectScores;

    // Constructor to initialize a GradeReport object with a student and their scores
    public GradeReport(Student student, List<SubjectScore> subjectScores) {
        this.student = student;
        this.subjectScores = subjectScores;
    }

    // Getter for student
    public Student getStudent() {
        return student;
    }

    // Getter for subject scores
    public List<SubjectScore> getSubjectScores() {
        return subjectScores;
    }

    // Generates a textual grade report for the student
    public String generateReport() {
        String report = "Grade Report for " + student.getName() + ":\n";
        report += subjectScores.stream()
                .map(score -> score.getSubjectName() + ": " + score.getLetterGrade())
                .collect(Collectors.joining("\n")) + "\n";

        // Append the final grade to the report
        report += "Final Grade: " + getFinalLetterGrade();
        return report;
    }

    // Calculates the average score from all subject scores
    public double calculateAverageScore() {
        return subjectScores.stream()
                .mapToInt(SubjectScore::getScore)
                .average()
                .orElse(0.0);  // Provide a default value if no scores exist
    }

    // Returns the final letter grade based on the average score
    public String getFinalLetterGrade() {
        return new SubjectScore("Final Grade", (int)calculateAverageScore()).getLetterGrade();
    }
}

package project.project;

public class SubjectScore {
    private String subjectName;
    private int score;
    // Constructor to initialize subjectName and score
    public SubjectScore(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }
    // Getter method to retrieve subjectName
    public String getSubjectName() {
        return subjectName;
    }
    // Getter method to retrieve score
    public int getScore() {
        return score;
    }

    // Method to calculate and return the letter grade based on the score
    public String getLetterGrade() {
        // Calculate letter grade based on score
        if (score >= 90)
            return "A"; // 'A' for scores 90 or above
        else if (score >= 80)
            return "B"; // 'B' for scores between 80 and 89
        else if (score >= 70)
            return "C"; // 'C' for scores between 70 and 79
        else if (score >= 60)
            return "D"; // 'D' for scores between 60 and 69
        else
            return "F"; // 'F' for scores below 60
    }
}

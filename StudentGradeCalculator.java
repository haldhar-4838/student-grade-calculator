import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables to store total marks and grade points
        double totalMarks = 0;
        double totalGradePoints = 0;

        // Input marks and calculate grade points for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the marks obtained in Subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();

            // Ensure marks are within the valid range (0-100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                return; // Exit the program
            }
            // Calculate grade points based on marks
            double gradePoints = calculateGradePoints(marks);

            // Update total marks and total grade points
            totalMarks += marks;
            totalGradePoints += gradePoints;
        }

        // Calculate the average marks
        double averageMarks = totalMarks / numSubjects;

        // Calculate the GPA (Grade Point Average)
        double gpa = totalGradePoints / numSubjects;

        // Determine the letter grade
        String letterGrade = determineLetterGrade(gpa);

        // Display the results
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("GPA: " + gpa);
        System.out.println("Letter Grade: " + letterGrade);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate grade points based on marks
    public static double calculateGradePoints(double marks) {
        if (marks >= 90) {
            return 4.0;
        } else if (marks >= 80) {
            return 3.0;
        } else if (marks >= 70) {
            return 2.0;
        } else if (marks >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // Function to determine the letter grade based on GPA
    public static String determineLetterGrade(double gpa) {
        if (gpa >= 3.5) {
            return "A";
        } else if (gpa >= 2.5) {
            return "B";
        } else if (gpa >= 1.5) {
            return "C";
        } else if (gpa >= 0.5) {
            return "D";
        } else {
            return "F";
        }
    }
}
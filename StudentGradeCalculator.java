package studentgradecalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Arrays to hold the subject names and marks
        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];

        // Input the subject names and marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
            System.out.print("Enter the marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
        }

        // Calculate total marks
        int totalMarks = calculateTotalMarks(marks);

        // Calculate average percentage
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

        // Determine grade
        char grade = determineGrade(averagePercentage);

        // Display results
        displayResults(subjects, marks, totalMarks, averagePercentage, grade);

        scanner.close();
    }

    private static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    private static char determineGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    private static void displayResults(String[] subjects, int[] marks, int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}


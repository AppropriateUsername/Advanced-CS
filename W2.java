// Savannah Steele
// Period 3
// Java W2 HW

import java.util.Scanner;

class TestScore {
    public static char LetterGrade(double score) {
        if (score < 0 || score > 100) {
            return 'X';
        } else if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void processGrades(double[] grades) {
        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];
        int passCount = 0;

        for(int i = 0; i < grades.length; i++) {
            double current = grades[i];
            sum += current;
            if (current > highest) {
                highest = current;
            }
            if (current < lowest) {
                lowest = current;
            }
            if (current >= 60) {
                passCount++;
            }

            char letter = LetterGrade(current);
            if (letter == 'X') {
                System.out.println("Grade" + (i + 1) + ": Invalid Score (" + current + ")");
            } else {
                System.out.println("Grade" + (i + 1) + ": " + letter + " (" + current + ")");
            }
        }

        double average = sum / grades.length;
        char overallLetter = LetterGrade(average);

        System.out.println("Average: " + average + " (" + overallLetter + ")");
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Pass Count: " + passCount);

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of grades: ");
            int n = scanner.nextInt();
            double[] grades = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            }
            processGrades(grades);
        }
    }

}
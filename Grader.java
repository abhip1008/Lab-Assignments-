import java.util.Scanner;
import java.io.*;
public class Grader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = null;
        System.out.println("How many grades would you like to enter? ");
        int numGrades = input.nextInt();
        if (numGrades < 0) {
            System.out.println("Please enter a positive number");
            numGrades = input.nextInt();
        }
        int[] gradeValues = new int[numGrades];
        System.out.println("Please enter the " + numGrades + " grades (Separated by space): ");
        for (int i = 0; i < gradeValues.length; i++) {
            gradeValues[i] = input.nextInt();
        }
        System.out.println("Grades and the letter equivalents: ");
        for(int grade : gradeValues) {
            System.out.println("Grade: " + grade + " | Letter: " + getLetterGrade(grade));
        }

        input.nextLine();
        System.out.println("Please enter a file name");
        String fileName = input.nextLine();
        try {
            output = new PrintWriter(new File(fileName));
            for(int i = 0; i < gradeValues.length; i++) {
                int grade = gradeValues[i];
                output.println(grade + " " + getLetterGrade(grade));
            }
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            output.close();
        }
        input.close();
    }

    public static String getLetterGrade(int grade) {

            switch (grade / 10) {
                case 10:
                case 9:
                    return "A";
                case 8:
                    return "B";
                case 7:
                    return "C";
                case 6:
                    return "D";
                default:
                    return "F";
            }
        }
    public static double average(int[] gradeValues) {
        int gradeSum = 0;
        double gradeAverage = 0.0;
        for(int n : gradeValues) {
            gradeSum += n;
        }
        gradeAverage = (double)(gradeSum / gradeValues.length);
        return gradeAverage;
    }

    /*
     * Question 1: Method Overloading
     * Question 2: Because the types double and float are not allowed to be used with switch.
     * All the other primitive types are allowed to use the switch statements
     */
    public static String getLetterGrade(double gradeAverage) {
        if(gradeAverage > 90) {
            return "A";
        } else if(gradeAverage >= 80 & gradeAverage < 90) {
            return "B";
        } else if(gradeAverage >= 70 & gradeAverage < 80) {
            return "C";
        } else if(gradeAverage >= 60 & gradeAverage < 70) {
            return "D";
        } else {
            return "F";
        }
    }
}
package Questiongradeandremarke;

 import java.util.Scanner;



public class Gradeandremarke {
    public static void main(String[] args) {
    try    (Scanner Scanner = new Scanner(System.in)) {
            //   Here the user wiil enter student's score out of 100
            System.out.print("Enter student score (0-100): ");
            int score = Scanner.nextInt();
            
            int grade;
            String remark;
            
            //   Determine grade and remark using a if-else-if statements
            if (score >= 80 && score <= 100) {
                grade = 1;
                remark = "D1";
            } else if (score >= 75 && score <= 79) {
                grade = 2;
                remark = "D2";
            } else if (score >= 66 && score <= 74) {
                grade = 3;
                remark = "C3";
            } else if (score >= 60 && score <= 65) {
                grade = 4;
                remark = "C4";
            } else if (score >= 50 && score <= 59) {
                grade = 5;
                remark = "C5";
            } else if (score >= 45 && score <= 49) {
                grade = 6;
                remark = "C6";
            } else if (score >= 35 && score <= 44) {
                grade = 7;
                remark = "P7";
            } else if (score >= 30 && score <= 34) {
                grade = 8;
                remark = "P8";
            } else if (score >= 0 && score <= 29) {
                grade = 9;
                remark = "F";
            } else {
                System.out.println("Invalid score entered.");
                Scanner.close();
                return;
            }
            
            // iii) Display the score, corresponding grade, and remark
            System.out.println("\n--- Grading Result ---");
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
        }
    }
}

       


package QuestionONE;

import java.util.Scanner;
 
public class Studentsgrade {
    public static void main(String[] args){
    try (Scanner input = new Scanner(System.in)) {
            // enter to store the count for each grade (1 to 9)
            // Index 0 will be unused for simplicity, so array size 10
            int[] gradeCounts = new int[10];
            
            int studentCount = 1;
            
            //  Accept and process scores for five (5) students using a while loop
            while (studentCount <= 5) {
                System.out.print("Enter score for student " + studentCount + " (0-100): ");
                int score = input.nextInt();
                
                int grade;
                String remark;
                
                // Determine grade and remark
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
                    System.out.println("Invalid score. Please enter a score between 0 and 100.");
                    continue; // Skip the increment and ask again for the same student index
                }
                
                // Display result for current student
                System.out.println("Student " + studentCount + " -> Score: " + score + ", Grade: " + grade + ", Remark: " + remark);
                
                // Update the summary count
                gradeCounts[grade]++;
                
                studentCount++;
            }
            
            //  After all entries, display a summary showing how many students scored each grade (1 to 9)
            System.out.println("\n--- Grade Distribution Summary ---");
            System.out.println("Grade\tCount");
            for (int i = 1; i <= 9; i++) {
                System.out.println(i + "\t" + gradeCounts[i]);
            }
        }
    }
}


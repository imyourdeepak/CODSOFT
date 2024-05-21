import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please Enter the marks obtained (out of 100) in each subject:");
        System.out.print("Subject 1: ");
        int subject1Marks = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2Marks = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3Marks = scanner.nextInt();
        System.out.print("Subject 4: ");
        int subject4Marks = scanner.nextInt();
        System.out.print("Subject 5: ");
        int subject5Marks = scanner.nextInt();
        System.out.print("Subject 6: ");
        int subject6Marks = scanner.nextInt();
        
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks + subject6Marks ;
        
        double averagePercentage = totalMarks / 6.0;
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}

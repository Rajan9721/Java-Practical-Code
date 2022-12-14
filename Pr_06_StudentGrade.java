import java.util.Scanner;

public class Pr_06_StudentGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percentage of student: ");
        double percent = sc.nextDouble();
        char grade;

        if (percent >= 80) {
            grade = 'A';
        } else if (percent >= 60 && percent < 80) {
            grade = 'B';
        } else if (percent >= 40 && percent < 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You are Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}

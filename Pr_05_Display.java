import java.util.Scanner;

public class Pr_05_Display {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Name: ");
            String Name = sc.next();
            System.out.print("Enter your Age: ");
            int age = sc.nextInt();
            System.out.print("Enter your joining date format(dd/mm/yyyy): ");
            int myDate = sc.nextInt();
            System.out.println("Enter Employee Salary: ");
            int sl = sc.nextInt();
            sc.close();
            System.out.print("Employee Name is: "+Name+" ,age is "+age+" date of joining is : "+myDate+" and salary is "+sl);


        }
}

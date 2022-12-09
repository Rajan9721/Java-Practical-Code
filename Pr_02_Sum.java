import java.util.Scanner;

public class Pr_02_Sum {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            int c = a+b;
            System.out.println("Sum of " +a+ " and "+b+ " is:=> "+ c);

        }
    }
}

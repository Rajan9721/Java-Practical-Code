import java.sql.SQLOutput;
import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num<=2){
            System.out.println("Invalid input");

        }
        else if(num == 3){
            System.out.println(num+" is prime number");
        }

        int temp = num/2;
        for(int i=2; i<=temp; i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                break;
            }
            System.out.println(num+" is prime number.");
            break;
        }


    }
}

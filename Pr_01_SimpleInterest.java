import java.sql.SQLOutput;
import java.util.Scanner;

public class Pr_01_SimpleInterest {
    public static void main(String[] args){
        double  P , R , T;
        /* P = Principal Amount
           R = Rate of interest
           T = duration for which the principal amount is given to someone.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        P = sc.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        R = sc.nextDouble();
        System.out.print("Enter Amount taken for Duration: ");
        T = sc.nextDouble();

        double SI = (P*R*T)/100;
        System.out.println("Simple Interest is: "+SI);
    }
}

import java.util.Scanner;

public class Pr_10_Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to know number is prime or not: ");
        int n = sc.nextInt();
        int temp = n/2;
        if(temp==0 || temp==1){
            System.out.print(n+" is not prime number.");
            return;
        }
        for(int i=2; i<=temp; i++){
            if(n%i==0) {
                System.out.println(n + " is not prime number.");
            }
            else{
                System.out.println(n+" is prime number.");
            }
            break;


        }

    }

}

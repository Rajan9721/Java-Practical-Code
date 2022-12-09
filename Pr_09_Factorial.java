import java.util.Scanner;

public class Pr_09_Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter a number for calculate Factorial: ");
        int n = sc.nextInt();
        if(n<0){
            for(int i=1; i<=(-n); i++){
                fact = fact*i;
            }
            System.out.println("Result is: -"+fact);
        }
        else{
            for(int i = 1; i<=n; i++){
                fact = fact*i;
            }
            System.out.println("Result is: "+fact);
        }

    }
}

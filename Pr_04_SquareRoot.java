import java.util.Scanner;

public class Pr_04_SquareRoot {
    public static void main(String[] args){
        System.out.print("Enter the number for find Square root: ");
        double num;
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        double temp;
        double sr = num/2; // result => sr = 8.0
        do {

            temp = sr;
            sr = (temp + (num/temp))/2;
        }while((temp-sr)!=0);
        System.out.println("Square Root of "+num+ " is: " +sr);
    }
}

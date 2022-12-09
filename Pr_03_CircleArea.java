import java.util.Scanner;

public class Pr_03_CircleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radios of Circle: ");
        double r = sc.nextDouble();
        sc.close();
        final double pi = 3.1416;
        double s = r*r*pi;
        System.out.println("Area of circle is: "+ s);
    }

}


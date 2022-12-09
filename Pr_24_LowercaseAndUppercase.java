import java.util.Scanner;

public class Pr_24_LowercaseAndUppercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String ");
        String str= scanner.nextLine();

        //print uppercase string
        System.out.println("Uppercase string = "+ str.toUpperCase());

        //print lowercase string
        System.out.println("Lowercase string = "+ str.toLowerCase());
    }
}

import java.util.Scanner;

public class Pr_16_Cap_FirstString {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Sentence: ");
            String str = sc.nextLine();
            String[] words = str.split(" ");
            String newStr = "";
            for(String word: words){
                newStr += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
            System.out.println("New String: " + newStr);
        }
}


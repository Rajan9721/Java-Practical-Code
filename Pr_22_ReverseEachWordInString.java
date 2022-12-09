import java.util.Scanner;

public class Pr_22_ReverseEachWordInString {
    public static String reverseWord(String str) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String string = sc.nextLine();
        System.out.println(Pr_22_ReverseEachWordInString.reverseWord(string));
    }
}
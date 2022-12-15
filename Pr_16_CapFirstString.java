import java.util.Scanner;

public class Pr_16_CapFirstString {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            // enter sentence here
            System.out.print("Enter sentence here : ");
            String line = sc.nextLine();
            String upper_case = "";

            // this is for the new line which is generated after conversion.
            Scanner lineScan = new Scanner(line);
            while(lineScan.hasNext())
            {
                String word = lineScan.next();
                upper_case += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }

            // print original line with output.
            System.out.println("Original sentence is : " +line);
            System.out.println("Sentence after convert : " +upper_case.trim());
        }
}


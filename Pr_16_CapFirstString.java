public class Pr_16_CapFirstString {
    public static void main(String[] args){
        String s1 = "rajan mca III semester";
        String firstChar = s1.substring(0,1);
        String remainingString = s1.substring(1,s1.length());
        firstChar = firstChar.toUpperCase();
        String s2 = firstChar + remainingString;
        System.out.println(s2);
    }
}

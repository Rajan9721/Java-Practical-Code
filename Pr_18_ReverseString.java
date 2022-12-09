public class Pr_18_ReverseString {
    public static void main(String[] args){
        String s1 = "Java Programming";
        StringBuilder sb = new StringBuilder("Java Programming");
        System.out.println("Given string is: "+sb);
        for(int i = 0; i<sb.length()/2; i++){
            int First = i;
            int Last = sb.length()-1-i;

            char FrontChar = sb.charAt(First);
            char BackChar = sb.charAt(Last);

            sb.setCharAt(First, BackChar);
            sb.setCharAt(Last, FrontChar);
        }
        System.out.println("Reverse Strings are: "+sb);
        
    }
}

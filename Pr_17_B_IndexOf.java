public class Pr_17_B_IndexOf {
    public static void main(String[] args) {

//        Example 2: lastIndexOf() With fromIndex Parameter

        String str1 = "Learn Java programming";
        int result;

        // search from index 0 to 4
        // searches the substring "Learn"
        result = str1.lastIndexOf('r', 4);
        System.out.println(result); // 3

        // search from index 0 to 12
        // searcheses the substring "Learn Java pr"
        result = str1.lastIndexOf('r', 12);
        System.out.println(result); // 12

        // string length is less than 100
        // searches the whole string
        result = str1.lastIndexOf('r', 70);
        System.out.println(result); // 15

        // searches the substring "Learn"
        result = str1.lastIndexOf("Java", 4);
        System.out.println(result); // -1
    }
}

public class Pr_17_StringIndex {
    public static void main(String[] args) {

//        Java String lastIndexOf() with only one parameter

        String str1 = "Learn Java";
        int result;

        // getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result); // 6

        // the last occurrence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result); // 9

        // character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result); // -1

        // getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result); // 7

        // substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result); // -1


    }
}

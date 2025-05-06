import java.util.*;
class Questions{
    // Check if a string is a palindrome or not 
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // For a given string convert each the first letter of each word to upper case.
    /*input: "the quick brown fox jumps over the lazy dog"
     output: "The Quick Brown Fox Jumps Over The Lazy Dog"
     */
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(Questions[] args){
        // Check if a string is a palindrome or not
        String str = "madam";
        isPalindrome(str);
        System.out.println("The string is a palindrome: " + isPalindrome(str));

        // For a given string convert each the first letter of each word to upper case.
        String str2 = "the quick brown fox jumps over the lazy dog";
        System.out.println("The string with first letter of each word in upper case: " + toUpperCase(str2));
    }
}
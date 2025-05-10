public class RemoveDuplicates {
    // Remove Duplicates in a String ---> Google, Microsoft interview question
    /*intput: "aaabbccddeee"
     * output: "abcde"
     */
    public static String removeDuplicates(String str) {
        // Base case: if the string is empty or has only one character, return it
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case: check the first character with the next one
        if (str.charAt(0) == str.charAt(1)) {
            // If they are the same, skip the first character and call the function recursively
            return removeDuplicates(str.substring(1));
        } else {
            // If they are different, keep the first character and call the function recursively
            return str.charAt(0) + removeDuplicates(str.substring(1));
        }
    }
    public static void main(String[] args){
        String input = "aaabbccddeeecollege";
        // Test with a string containing duplicates
        String result = removeDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
        // Test with an empty string
    }
}

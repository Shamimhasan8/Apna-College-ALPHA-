public class BinaryString {
    // Binary String problem ----> paypal interview question
    /*Print all binary string of sizeM without consecutives ones */
    public static void printBinaryString(int n, int lastDigit, String str) {
        // Base case: if the length of the string is equal to n, print it
        if (str.length() == n) {
            System.out.println(str);
            return;
        }
        // Recursive case: add '0' and '1' to the string based on the last digit
        printBinaryString(n, 0, str + "0");
        if (lastDigit == 0) {
            printBinaryString(n, 1, str + "1");
        }
    }
    public static void main(String[] args){
        int n = 3; // Length of the binary string
        printBinaryString(n, 0, "");
    }
    
}

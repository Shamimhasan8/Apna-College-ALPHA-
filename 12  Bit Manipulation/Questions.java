public class Questions {
    // Question 1: check if a number is odd or even
    public static void isOddOrEven(int n){
        int mask = 1; // 0001
        if((n & mask) == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    } 
    // Question 2 : check if a numbers is a power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return ( n > 0 && (n & (n - 1)) == 0);
        }
    // Questions 3: Count set bits in a number ----> google, amazon interviw question
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            count += (n & 1); // check if the last bit is set
            n >>= 1; // right shift the number by 1
        }
        return count;
    }
    // Fast exponentiation
    public static int fastExponentiation(int a, int b){
        int result = 1;
        while(b > 0){
            if((b & 1) == 1){ // if b is odd
                result *= a;
            }
            a *= a; // square the base
            b >>= 1; // right shift b by 1
        }
        return result;
    }
    public static void main(String[] args){
        // Test the isOddOrEven method
        isOddOrEven(5); // Output: 5 is odd
        isOddOrEven(10); // Output: 10 is even
        // Test the isPowerOfTwo method
        System.out.println(isPowerOfTwo(9)); // Output: true
        // Test the countSetBits method
        System.out.println(countSetBits(9)); // Output: 2 (binary representation of 9 is 1001)
        // Test the fastExponentiation method
        System.out.println(fastExponentiation(2, 10)); // Output: 1024 (2^10)
    }
}

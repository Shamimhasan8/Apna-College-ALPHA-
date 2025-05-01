class Questions{
    /*Questions 1 - Write a java method to compute the average of three numbers */
    public static int average(int a, int b,  int c){
        return (a + b + c) / 3;
    }
    /*Questions 2 - Write a method named isEven that accepts an integer as a parameter and returns true if the number is even.  */
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }   
    }
    /*Questions 3 - Write a java program to check if a number is a palindrome in java?(121 is a palindrome 321 is not) */
    public static void isPalindrome(int n){
        int rev = 0, temp = n;
        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(rev == n){
            System.out.println(n + " is a palindrome number.");
        }else{
            System.out.println(n + " is not a palindrome number.");
        }
    }
    public static void main(String[] args){}
}

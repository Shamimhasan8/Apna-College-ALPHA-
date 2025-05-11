class Questions{
    /*Questions 1: 
     * For a given integer array of Size N. You have to find all the occurences (indices) of a given element (key) and print them.
       Use a recursive function to solve this problem.
       Sample Inpu: arr[] = {3,2,4,5,6,2,7,2,2}, key = 2
       sample output: 1 5 7 8
     */
    public static void allOccurences(int arr[], int key, int i){
        // Base case
        if (i == arr.length){
            return;
        }
        // recursive
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurences(arr, key, i+1);
    }
    /* You are given a number(eg - 2018), convert it into a String of english like "two zero one nine",
    Use a recursive function to solve this problem.
    Note - The digit of the number will only be in the range 0-9 and the last digit of a number can't be 0.
    Sample input: 1947
    Sample output: "One nine four seven"
    */ 
    public static void printDigits(int number){
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (number == 0){
            return;
        }
        int lastdigits = number%10;
        printDigits(number/10);
        System.out.print(digits[lastdigits] + " ");
    }
    /*Write a program to ding Length of a Striing using Recursion */
    public static int StrLength(String str){
        if (0 == str.length()){
            return 0;
        }
        return StrLength(str.substring(1)) + 1;
    }
    /*We are given a string S, we need to find the count of all contiguoussubstrings startng and ending with the same character
    sample input: S = "abcab"
    sample output: 7
     */
    public static int countsubstrs(String str, int i, int j, int n){
        if (n == 1){
            return 1;
        }
        if (n <= 0){
            return 0;
        }
        int res = countsubstrs(str,i+1, j, n-1) +
                  countsubstrs(str, i, j - 1, n - 1) -
                  countsubstrs(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args){
        // allOccurences
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        allOccurences(arr, key, 0);
        System.out.println();
        // printDigits
        printDigits(2004);
        System.out.println();
        //StrLength
        String str1 = "abcde";
        System.out.println(StrLength(str1));
        // CountSubStrs
        String str = "abcab";
        int n = str.length();
        System.out.print(countsubstrs(str, 0, n-1, n));
    }
}
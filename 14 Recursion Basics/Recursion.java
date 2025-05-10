class Recursion{
    // print numbers in descending order
    public static void PrintDescending(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        PrintDescending(n-1);
    }
    // print numbers in ascending order
    public static void PrintAscending(int n){
        if(n==0){
            return;
        }
        PrintAscending(n-1);
        System.out.print(n + " ");
    }
    // print sun of first n natural numbers
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        int sum = Sum(n-1);
        int result = n + sum;
        return result;
    }
    // This is a simple recursive function to calculate the factorial of a number
    public static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact = Factorial(n-1);
        return n*fact;
    }
    // Print Nth Fibonacci number
    public static int Fibonacci(int n){
        if (n == 1 || n == 0) {
            return n;   
        }
        int fib1 = Fibonacci(n - 1);
        int fib2 = Fibonacci(n - 2);
        int result = fib1 + fib2;
        return result;

    }
    // Check if array is sorted
    public static boolean IsSorted(int arr[], int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index + 1]){
            return false;
        }
        return IsSorted(arr, index + 1);
    }
    // WAF to find the first occurrence of an element in an array
    public static int FirstOccurrence(int arr[], int index, int element){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == element){
            return index;
        }
        return FirstOccurrence(arr, index + 1, element);
    }
    // WAF to find the last occurrence of an element in an array
    public static int LastOccurrence(int arr[], int index, int element){
        if(index == arr.length){
            return -1;
        }
        int lastIndex = LastOccurrence(arr, index + 1, element);
        if(lastIndex != -1){
            return lastIndex;
        }
        if(arr[index] == element){
            return index;
        }
        return -1;
    }
    // print X^n in O(log n)
    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = Power(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if(n % 2 != 0){
            return halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        // Test the PrintDescending function
        int n = 5;
        PrintDescending(n);
        System.out.println("Numbers in descending order: " + n);
        // Test the PrintAscending function
        PrintAscending(n);
        System.out.println("Numbers in ascending order: " + n);
        // Test the Sum function
        int sumResult = Sum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sumResult);
        // Test the Factorial function
        int number = 5;
        int result = Factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
        // Test the Fibonacci function
        int fibNumber = 25   ;
        int fibResult = Fibonacci(fibNumber);
        System.out.println("The " + fibNumber + "th Fibonacci number is: " + fibResult);
        // Test the IsSorted function
        int arr[] = {1, 2, 3, 4, 5};
        boolean isSorted = IsSorted(arr, 0);
        System.out.println("Is the array sorted? " + isSorted);
        // Test the FirstOccurrence function
        int arr2[] = {1, 2, 3, 4, 5, 3};
        int element = 3;
        int firstOccurrence = FirstOccurrence(arr2, 0, element);
        System.out.println("The first occurrence of " + element + " in the array is at index: " + firstOccurrence);
        // Test the LastOccurrence function
        int lastOccurrence = LastOccurrence(arr2, 0, element);
        System.out.println("The last occurrence of " + element + " in the array is at index: " + lastOccurrence);
        // Test the Power function
        int x = 2;
        int power = 10;
        int powerResult = Power(x, power);
        System.out.println(x + " raised to the power of " + power + " is: " + powerResult);
    }
}
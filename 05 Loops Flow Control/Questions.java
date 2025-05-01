import java.util.*;
public class Questions {
    public static void main(String args[]){
        /* Question2: Write a program that reads a set of integers,and then prints the sum of the even and odd integers. */
        Scanner input = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            number = input.nextInt();
            if( number % 2 == 0) {
                    evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
        choice = input.nextInt();
        } while(choice==1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        /*Question 3 :Write a program to find the factorialof any number entered by the user. */
        System.out.print("Enter a number to find its factorial: ");
        int num = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);


        /* Question4: Write a program to print the multiplication table of a number N,entered by the user. */
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        input.close();
    }
}
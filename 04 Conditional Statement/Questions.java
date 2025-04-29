import java.util.*;
public class Questions {

    public static void main(String[] args){
    /*Question1: Write a Java program to get a number from the user and print whether it is positive or negative. */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number > 0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative.");
        }
        /* Question3: Writea Java program to input week number (1-7) and print day of week name using switch case. */
         /* Input week number from user */
        System.out.print("Enter week number(1-7): ");
        int week = input.nextInt();
        switch(week) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid week number. Please enter a number between 1 and 7.");
        }
        /* Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not. */
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(year % 4 == 0 && (year % 100 !=0 || year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
        input.close();
     }
}

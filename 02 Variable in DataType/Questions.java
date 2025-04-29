import java.util.*;
public class Questions {
    public static void main(String[] args){
/*  Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int a = input.nextInt();
        System.out.print("Enter B number: ");
        int b = input.nextInt();
        System.out.print("Enter C number: ");
        int c = input.nextInt();
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Sum of A, B and C is: " + sum);
        System.out.println("Average of A, B and C is: " + avg);

    
/* Question 2: In a program, input the side of a square. You have to output the area of thesquare.
 (Hint : area of a square is (side x side)) */
    System.out.print("Enter side number: ");
    int side = input.nextInt();
    float area = side * side;
    System.out.println("Area of square is: " + area);

/* Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and 
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
    System.out.print("Enter cost of pencil: ");
    float pencil = input.nextFloat();
    System.out.print("Enter cost of pen: ");
    float pen = input.nextFloat();
    System.out.print("Enter cost of eraser: ");
    float eraser = input.nextFloat();
    float totalCost = pencil + pen + eraser ;
    System.out.println("Total cost of items is: " + totalCost);
     //Add on - with 18% tax
    float gst = totalCost * 0.18f;
    System.out.println("Total cost with GST is: " + (totalCost + gst));
    input.close();
    }
}
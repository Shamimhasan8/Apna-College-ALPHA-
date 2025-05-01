// Decimal To Binary 
public class DecToBin {
    public static void dectobin(int decnum){
        int mynum = decnum;
        int power = 0;
        int binnum = 0;
        while(mynum != 0){
            int lastDigit = mynum % 2;
            binnum += lastDigit * Math.pow(10, power);
            mynum /= 2;
            power++;
            if(mynum == 0){
                System.out.println("Your Decimal number is: " + decnum + "\n" + "Binary number is: " + binnum);
        } 
            }
        }
    public static void main(String[]args){
        int decnum = 11; // Example decimal number  
        dectobin(decnum); // Call the method to convert decimal to binary
    }
}

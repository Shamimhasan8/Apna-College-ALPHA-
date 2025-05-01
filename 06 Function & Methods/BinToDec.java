// Binary to Decimal
public class BinToDec {
    public static void binTodec(int binNum){
        int mynum = binNum;
        int power = 0;
        int decnum = 0;
        while (mynum != 0) {
            int lastDigit = mynum % 10;
            decnum += lastDigit * Math.pow(2, power);
            mynum /= 10;
            power++;
        }
        System.out.println("Your Binary number is: " + binNum + "\n"+"Decimal number is: " + decnum);
    }
    public static void main(String[] args){
        int binNum = 1011; // Example binary number
        binTodec(binNum); // Call the method to convert binary to decimal
    }
}

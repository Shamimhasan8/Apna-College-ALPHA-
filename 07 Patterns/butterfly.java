public class butterfly {
    public static void main(String[] args){
        int n = 8;
        // outer loop for rows
        // 1st half of the butterfly
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                // print star
                System.out.print("*");
            }
            for(int j = 1; j <= 2 *(n-i); j++){
                // print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                // print star
                System.out.print("*");
            }
            // print new line at the end of each row
            System.out.println();
        }
        // 2nd half of the butterfly
        for (int i =n; i>= 1; i--){
            for (int j = 1; j <= i; j++){
                // print star
                System.out.print("*");
            }
            for(int j = 1; j <= 2 *(n-i); j++){
                // print space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                // print star
                System.out.print("*");
            }
            // print new line at the end of each row
            System.out.println();
        }
    }
    
}

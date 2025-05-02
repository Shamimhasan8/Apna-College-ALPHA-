public class Questions {
    // Function to print a hollow rectangle pattern
    public static void HOLLOW_RECTANGLE (int TotalRows, int TotalColumns) {
        // outer loop for rows
        for (int row = 1; row <= TotalRows; row++) {
            // inner loop for columns 
            for (int column = 1; column <= TotalColumns; column++){
                // print star at the first and last row and column
                if (row == 1 || row == TotalRows || column == 1 || column == TotalColumns){
                    System.out.print("*");
                }else{
                    // print space for the rest of the rectangle 
                    System.out.print(" ");
                }    
            }
            // print new line at the end of each row
            System.out.println();
        }
}
    // INVERTED & ROTATED HALF-PYRAMID pattern
    public static void INVERTED_ROTATED_HALF_PYRAMID(int n){
        for (int i = 1; i <= n; i++){
            // print spaces
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // print new line at the end of each row
            System.out.println();
        }
    }
    // INVERTED HALF-PYRAMID with Numbers pattern
    public static void INVERTED_HALF_PYRAMID_WITH_NUMBERS(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // FLOYD'S Triangle pattern
    public static void FLOYDS_TRIANGLE(int n){
        int counter = 1;
        for ( int i = 1; i <= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    // 0-1 Triangle pattern
    public static void ZERO_ONE_TRIANGLE(int n){
        // outer loop for rows
        for (int i = 1; i <= n; i++){
            // inner Loop for columns
            for (int j = 1; j <= i; j++){
                // print 1 if the sum of row and column is even, else print 0
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                } 
            }
            // print new line at the end of each row
            System.out.println();
            }
        }
        // SOLID RHOMBUS pattern
        public static void solid_rhombus(int n){
            for (int i = 1; i <= n; i++){
                // print spaces
                for (int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }
                // print stars
                for (int j = 1; j <= n; j++){
                    System.out.print("*");
                }
                // print new line at the end of each row
                System.out.println();
            }
        }
        //HOLLOW RHOMBUS pattern
        public static void hollow_rhombus(int TotalRows, int TotalColumns){
            for (int row = 1; row <=TotalRows; row++){
                // print spaces
                for (int j = 1; j <= TotalRows - row; j++){
                    System.out.print(" ");
                }
                // print stars
                for (int column = 1; column <= TotalColumns; column++){
                    // print star at the first and last row and column
                    if (row == 1 || row == TotalRows || column == 1 || column == TotalColumns){
                        System.out.print("*");
                    }else{
                        // print space for the rest of the rectangle 
                        System.out.print(" ");
                    }    
                }
                // print new line at the end of each row
                System.out.println();
            }
        }

        // DIAMOND pattern
        public static void diamond(int n){
            // upper half of the diamond
            for (int i = 1; i <= n; i++){
                // print spaces
                for (int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }
                // print stars
                for (int j = 1; j <= 2 * i - 1; j++){
                    System.out.print("*");
                }
                // print new line at the end of each row
                System.out.println();
            }
            // lower half of the diamond
            for (int i = n - 1; i >= 1; i--){
                // print spaces
                for (int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }
                // print stars
                for (int j = 1; j <= 2 * i - 1; j++){
                    System.out.print("*");
                }
                // print new line at the end of each row
                System.out.println();
            }
        }

    
    public static void main(String[] args){
        HOLLOW_RECTANGLE(4, 5);
        INVERTED_ROTATED_HALF_PYRAMID(4);
        INVERTED_HALF_PYRAMID_WITH_NUMBERS(4);
        FLOYDS_TRIANGLE(4);
        ZERO_ONE_TRIANGLE(4);
        solid_rhombus(5);
        hollow_rhombus(5, 5);
        diamond(5);
    }
}

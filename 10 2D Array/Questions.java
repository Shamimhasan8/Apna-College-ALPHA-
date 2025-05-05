public class Questions {
    /*Question 1: print the number of 7's that are in the 2d array.
      input- {{4,7,8},{8,8,7}}
      output - 2;
     */
    public static void countSevens(int[][] arr) {
        int countOf7 = 0;
        for(int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 7){
                    countOf7++;
                }
            }
        }
        System.out.println("Count of 7 is: " + countOf7);
    }

    /*Question 2: print out the sum of the numbers in the second row of the "nums" array.
      input- {{1,4,9},{11,4,3},{2,2,3}}
      output - 18;
     */
    public static void sumOfSecondRow(int[][] nums){
        int sum = 0;
        for(int j = 0;  j < nums[1].length; j++){
            sum += nums[1][j];
        }
        System.out.println("Sum of second row is: " + sum);
    }

    /* Question 3: Write a program to find Transpose of a matrix.
     What is Transpose of a matrix?
    Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 marix,
    Matrix 
    a11 a12 a13
    a21 a22 a23
    Transpose of matrix is:
    a11 a21
    a12 a22
    a13 a23
     */

    public static void transposeMatrix(int[][] matrix , int rows, int cols){
        int [][] transpose = new int[cols][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int[][] matrix) {
        System.out.println("The Matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // Test the countSevens method
        int [][] arr = {{4,7,8},{8,8,7}};
        countSevens(arr);

        // Test the sumOfSecondRow method
        int [][] nums = {{1,4,9},{11,4,3},{2,2,3}};
        sumOfSecondRow(nums);

        // Test the transposeMatrix method
        int [][] matrix = {{1,2,3},{4,5,6}};
        int rows = 2;
        int cols = 3;
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("Transpose of the Matrix:");
        transposeMatrix(matrix, rows, cols);
    }
}

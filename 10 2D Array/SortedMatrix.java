// Search in sorted matrix --------> Interview Question
/*
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
            key = 29
            Output: (2, 1)
 */

public class SortedMatrix {
    // 0(n + m) time complexity
    public static boolean searchInSortedMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1; // last column
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 29;
        boolean result = searchInSortedMatrix(matrix, key);
    }
}

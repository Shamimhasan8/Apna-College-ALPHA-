// Diaqonal Sum of a matrix ------> microsoft, Amazon, Sumsang etc Interview Question
/* {1,2,3,4},
   {5,6,7,8},
   {9,10,11,12},
   {13,14,15,16} 
   Output: 68 */
   
public class DiagonlSum {
        // 0(n^2) time complexity
        public static int diagonalSum0(int martix[][]){
            int sum = 0;
            for(int i = 0; i < martix.length; i++){   // 0(n^2) time complexity
                for(int j = 0; j < martix[0].length; j++){
                    if(i == j){
                        sum += martix[i][j];
                    }
                    if(i + j == martix.length - 1){
                        sum += martix[i][j];
                    }
                }
            }
            return sum ; 
        }

        // 0(n) time complexity
        public static int diagonalSum1(int martix[][]){
            int sum = 0;
            for (int i = 0; i < martix.length; i++){ // 0(n) time complexity
                sum += martix[i][i]; // for primary diagonal
                if (i != martix.length - 1 - i) // to avoid double counting the middle element in case of odd length matrix
                    sum += martix[i][martix.length - 1 - i]; // for secondary diagonal
            }
            return sum ; 
        }
        public static void main(String[] args){
        int martix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println("Diagonal sum of the matrix is: " + diagonalSum0(martix));
        System.out.println("Diagonal sum of the matrix is: " + diagonalSum1(martix));
    }
    
}

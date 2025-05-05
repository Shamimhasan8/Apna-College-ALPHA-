// 2D Array Spiral Matrix ------> Google, apple, Microsoft, Abode, amazon etc Interview Question
/* {1,2,3,4},
   {5,6,7,8},
   {9,10,11,12},
   {13,14,15,16} 
   Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 */


class SpiralMatrix{
    public static void printSpiral(int martix[][]){
        int starRow = 0;
        int startCol = 0;
        int endRow = martix.length - 1;
        int endCol = martix[0].length - 1;

        while(starRow <= endRow && startCol <= endCol){
            // print first top row
            for(int j = startCol; j <= endCol; j++){
                System.out.print(martix[starRow][j] + " ");
            }
            // right column
            for(int i = starRow + 1; i <= endRow; i++){
                System.out.print(martix[i][endCol] + " ");
            }
            // bottom row
            for(int j = endCol - 1; j >= startCol; j--){
                if(starRow == endRow) break; // to avoid duplicate row
                System.out.print(martix[endRow][j] + " ");
            }
            // left column
            for(int i = endRow - 1; i > starRow; i--){
                if(startCol == endCol) break; // to avoid duplicate column
                System.out.print(martix[i][startCol] + " ");
            }
            starRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }
    public static void main(String[] args){
        int martix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiral(martix);
        }
    }
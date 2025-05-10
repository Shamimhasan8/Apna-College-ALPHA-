public class TilingProblem {
    // Tiling Problem ------> Amazon interview question
    /*Given a "2xn"  board and tiles of size "2x1", count the number of ways to tile the given board using the 2 x1 tiles
     * (A tile can either be placed hearizontally or vertically)
     */
    public static int titleProblem(int n){
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }
        // Recursive case
        int vertical = titleProblem(n - 1);
        int horizontal = titleProblem(n - 2);
        return vertical + horizontal;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println("Number of ways to tile the board: " + titleProblem(n));
    }
}

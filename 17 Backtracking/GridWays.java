public class GridWays {
    // Grid ways 
    /*Find number of ways to reach from(0,0) to (N-1,M-1) in a NxM grid.
     Allowed moves - right or down
     */
    public static int gridways(int i, int j, int n, int m){
        // Base case 
        if(i == n-1 && j == m-1){
            return 1; // reached the destination
        } else if(i >= n || j >= m){
            return 0; // out of bounds
        }
        // Recursive case
        int w1 = gridways(i+1, j, n, m); // down
        int w2 = gridways(i, j+1, n, m); // right
        return w1 + w2; // total ways
    }
    public static void main(String[] args){
        int n = 3; // number of rows
        int m = 3; // number of columns
        System.out.println("Number of ways to reach the destination: " + gridways(0, 0, n, m));
    }
}

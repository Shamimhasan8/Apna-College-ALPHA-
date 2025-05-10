public class FriendsPairing {
    // Friendss pairing problem ----> Goldman Sachs interview question
    /*Give n frined, each one can remain single or can be paired up with some other friend. Each can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. */
    public static int countWays(int n) {
    //     // Base case: if there are no friends or one friend, return 1
    //     if (n <= 1) {
    //         return 1;
    //     }

    //     // Recursive case: two options
    //     // 1. The nth friend remains single
    //     int single = countWays(n - 1);

    //     // 2. The nth friend pairs up with any of the (n-1) friends
    //     int pair = (n - 1) * countWays(n - 2);

    //     // Total ways = single + pair
    //     return single + pair;
    // }
    
    if(n == 1 || n == 0){
        return 1;
    }
    return countWays(n-1) + (n-1) * countWays(n-2);
    }
      
     public static void main(String[] args) {
        int n = 3; // Number of friends
        System.out.println("Number of ways to pair " + n + " friends: " + countWays(n));
    }
}

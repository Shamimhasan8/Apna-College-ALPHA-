class backtracking{
    // Find subsets
    /* Find and print all subsets of a give string
    input: "abc"
    output: "", "a", "b", "c", "ab", "ac", "bc", "abc"*/ 
    public static void findsubsets(String str, String ans, int i){
        // Base case
        if (i == str.length()){
            if (ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // Yes choice
        findsubsets(str, ans + str.charAt(i),i +1);
        // No Choice
        findsubsets(str, ans, i + 1);
    }
    // Find permulations
    /*Find and print all permulations of a string using backtracking
     * input: "abc"
     * output: "abc", "acb", "bac", "bca", "cab", "cba"*/
    public static void findpermulations(String str, String ans){
        // Base case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // Loop through the string
        for(int i = 0; i < str.length(); i++){
            // Choose the current character 
            char ch = str.charAt(i);
             // Remaining string after removing the chosen character
             String Newstr= str.substring(0,i) + str.substring(i+1);
            // Recursive call
            findpermulations(Newstr, ans + ch);
        }
    }
    public static void main(String[] args){
        // Example usage Find subsets
        String str = "abc";
        String ans = "";
        int i = 0;
        findsubsets(str, ans, i);
        // Example usage Find permulations
        String str1 = "abc";
        String ans1 = "";
        findpermulations(str1, ans1);
    }
}
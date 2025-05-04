public class Arrays {
    // Reverse an array
    public static void reverseArray(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            // Swap the elements at start and end indices
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    // Pairs in an array
    public static void pairsInArray(int numbers[]) {
        int totalPairs = 0;
        for(int i =0; i < numbers.length; i++){
            int current = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                System.out.print("("+ current + "," + numbers[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
    }

    // Print subarrays
    public static void printSubarrays(int numbers[]){
        // Loop through the array to get the starting index of the subarray
        int totalSubarrays = 0;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            // Loop through the array to get the ending index of the subarray
            for(int j = i; j < numbers.length; j++){
                int end = j;
                // Print the subarray from start to end indices
                for(int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + totalSubarrays);  
        System.out.println("Sum of all subarrays: " + sum);
    }

    // Max subarray sum
    public static int maxSubarraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            int currentSum = 0;
            for(int j = i; j < numbers.length; j++){
                currentSum += numbers[j];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    // Max subarray sum kadane's algorithm
    public static void maxSubarraySumKadane(int numbers2[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < numbers2.length; i++){
            cs = cs + numbers2[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
            if (cs > 0 && ms == 0){
                ms = 0;
            }
        }
        System.out.println("Max subarray sum using Kadane's algorithm: " + ms);
    }
    public static void main(String[] args){
        // Example usage of reverseArray method
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(numbers);
        // Print the reversed array
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // Example usage of pairsInArray method
        pairsInArray(numbers);
        // Example usage of printSubarrays method
        printSubarrays(numbers);
        // Example usage of maxSubarraySum method
        int maxSum = maxSubarraySum(numbers);
        System.out.println("Max subarray sum: " + maxSum);
        // Example usage of maxSubarraySumKadane method
        int numbers2[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubarraySumKadane(numbers2);
        
    }
    
}

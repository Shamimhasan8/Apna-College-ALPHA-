public class Questions {
    // Search in rotated sorted Array
    /*Input: Sorted,rotated array with distinct numbers (in asceding order) It is rotated at a pivot point. Find the index of given element 
     * intput = {4,5,6,7,0,1,2}, target = 0
     * output = 4
    */
    public static int search(int arr[], int target,int start, int end){
        // base case
        if(start > end){
            return -1;
        } 
        
        int mid = (start + end) / 2;

        // case Found
        if(arr[mid] == target){
            return mid;
        }
        // mid on L1
        if(arr[start] <= arr[mid]){
            // case a : left side
            if(arr[start] <= target && target < arr[mid]){
                return search(arr, target, start, mid );
            }
            else{
                // case b : right side
                return search(arr, target, mid + 1, end);
            }
        }
        // mid on L2
        else{
            // case c : left side
            if(arr[mid] < target && target <= arr[end]){
                return search(arr, target, mid + 1, end);
            }
            else{
                // case d : right side
                return search(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args){
        // Test the search function
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

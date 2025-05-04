public class CountingSort {
    public static void countingSortDescending(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        // create a frequency array 
        int freq[] = new int[largest + 1];
        for(int i =0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        // sort the array in descending order
        int j = 0;
        for(int i = freq.length - 1; i >= 0; i--){
            while(freq[i] > 0){
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }

    }
    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.println("Before sorting: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter sorting: ");
        countingSortDescending(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

public class InsertionSort {
    public static void insertionSortDescending(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int prev = i - 1;
            // find the correct position for current
            while(prev >= 0 && arr[prev] < current){
                arr[prev +1] = arr[prev]; // shift the larger element to the right
                prev--;
            }
            // place current at its correct position
            arr[prev + 1] = current;
        }
    }
    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        System.out.println("Before sorting: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nAfter sorting: ");
        insertionSortDescending(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

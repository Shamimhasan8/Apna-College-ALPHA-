public class QuickSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quicksort(arr, start, pivotIndex - 1); // Sort left side
        quicksort(arr, pivotIndex + 1, end); // Sort right side
        }
    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end]; // Choose the last element as pivot
        int i = start - 1; // Pointer for the smaller  element
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) { // If current element is smaller than or equal to pivot
                i++; // Increment index of smaller element
                // swap
                int temp = arr[j];
                arr[j] = arr[i]; // swap arr[i] and arr[j]
                arr[i] = temp;
            }
        }
        i++; // Increment index of smaller element
        // swap
        int temp = pivot;
        arr[end] = arr[i]; // swap arr[i] and arr[end]
        arr[i] = temp;
        return i; // Return the index of the pivot element
    }
    public static void main(String[] args){
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}

class MergeSort{
    public static void mergeSort(int arr[], int start, int end){
        if(start >= end){ // base case, when there is only one element in the array, it is already sorted, so no need to sort it again
            return;
    }
    int mid = (start + end) / 2; // find the middle index
    mergeSort(arr, start, mid); // sort the left half
    mergeSort(arr, mid + 1, end); // sort the right half
    merge(arr, start, mid, end); // merge the two halves
    }
    // merge mathod to merge the sorted parts
    public static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1]; // create a temporary array to store the merged array
        int i = start; // index for the left half
        int j = mid + 1; // index for the right half
        int k = 0; // index for the temporary array

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i]; // if the left half is smaller, add it to the temporary array
                i++;
        }else {
                temp[k] = arr[j]; // if the right half is smaller, add it to the temporary array
                j++;
        }
            k++;
        }
    // for left over elements of 1st sorted part
    while(i <= mid){
        temp[k++] = arr[i++]; // add the remaining elements of the left half to the temporary array
    }
    // for left over elements of 2nd sorted part
    while(j <= end){
        temp[k++] = arr[j++]; // add the remaining elements of the right half to the temporary array
    }
    // copy the sorted array back to the original array
    for(int l = 0; l < temp.length; l++){
        arr[start + l] = temp[l]; // copy the temporary array back to the original array
    }
    }

    public static void main(String[] args){
        int arr[] = {12, 11, 13, 5, 6, 7}; // example array to be sorted
        System.out.println("Given array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // print the original array
        }
        System.out.println();
        mergeSort(arr, 0, arr.length - 1); // call the mergeSort method
        System.out.println("Sorted array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // print the sorted array
        }
    }
}
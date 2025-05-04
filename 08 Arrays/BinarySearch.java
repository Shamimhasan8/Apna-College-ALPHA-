public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid; // if the element is found, return its index
            }else if(arr[mid] < key){
                start = mid + 1; // search in the right half
            }else{
                end = mid - 1; // search in the left half
            }
        }
        return -1; // if the element is not found, return -1
    }

    public static void main(String[] args) {
        int arr[] = {2,4,8,16,32,64,128,256,512,1024};
        int key = 512;
        int index = binarySearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

public class LinearSearch {
    public static int Linearsearch (int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1; // if the element is not found, return -1
    }

    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int key = 10;
        int index = Linearsearch(arr, key);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found in the array.");
        }

    }
    
}

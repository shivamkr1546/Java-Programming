package PRACTICE;
public class practicep {
    //sum of arrays 
    public static void sumOfArrays(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array is:- "+ sum);
    }

    //largest element
    public static int largestElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //Binary search
    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end = mid - 1;
            }else{
                start = mid + 1; 
            }
        }
        return -1;
    }

    //Reverse the arrays
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        // int arr[] = {2,3,4};
        // int key = 4;
        System.out.println();
    }
}

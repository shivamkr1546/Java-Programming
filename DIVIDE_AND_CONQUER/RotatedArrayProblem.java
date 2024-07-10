package DIVIDE_AND_CONQUER;

public class RotatedArrayProblem {

    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // case found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a:
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case b:
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case c: right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
            // case d: left
            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static int searchIteration(int arr[], int tar, int si, int ei){
        while(si<=ei){

            int mid = si + (ei-si)/2;
            //case found
            if(arr[mid]==tar){
                return mid;
            }
            // mid on L1
            else if(arr[si]<=arr[mid]){
                // case tar on left of mid
                if(arr[si]<=tar && tar<=arr[mid]){
                    ei = mid - 1;
                }
                // case tar on right of mid
                else{
                    si = mid + 1;
                }
            }
            // mid on L2
            else{
                // case tar on left of mid
                if(arr[mid]<=tar && tar<=arr[ei]){
                    ei = mid - 1;
                }
                // case tar on right of mid
                else{
                    si = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        int idx = searchIteration(arr, target, 0, arr.length-1);
        System.out.println(idx);
    }
}

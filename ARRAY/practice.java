package ARRAY;
/* Program to sum the elements of the arrays */
// import java.util.*;
// public class arraysBasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum =0; 
//         for(int i=0; i<arr.length; i++){
//             sum+=arr[i];
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }

/* Program to find the largest element in array */
// import java.util.*;
// public class practice {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = 0;
//         for(int i=0; i<arr.length; i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }
//         }
//         System.out.print("Max element of the array: "+max);

//     }
// }

/* Array program for array rotation */
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();
//         int[] arr= new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the time you want to rotate the array: ");
//         int m = sc.nextInt();
//         for(int j=0; j<m; j++){
//             int temp = arr[0];
//             for(int i=0; i<n-1; i++){
//                 arr[i] = arr[i+1];
//             }
//             arr[arr.length - 1] = temp;
//         }
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

/* Program to Reverse the array */
// import java.util.*;
// public class practice {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         int i=0;
//         int j=n-1;
//         while(i<=j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//         for(int k=0; k<n; k++){
//             System.out.print(arr[k]+" ");
//         }
//     }
// }

/* Program to print pair arrays */
// public class practice {
//     public static void main(String args[]){
//         int n=5;
//         int[] arr = {2,4,6,8,10};
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 System.out.print("("+arr[i]+","+arr[j]+") ");
//             }
//             System.out.println();
//         }

//     }
// }

/* Program to print sub arrays */
// public class practice {
//     public static void main(String args[]){
//         int n=5;
//         int[] arr = {2,4,6,8,10};
//         // int minSum = Integer.MAX_VALUE;
//         // int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<n; i++){
//             for(int j=i; j<n; j++){
//                 for(int k=i; k<j; k++){
//                     System.out.print(arr[k]+" ");
//                 } 
//                 System.out.println();
//             }
//             System.out.println();
//         }

//     }
// }

/* program to print sub arrays sums and also max sum */
// public class practice {
//     public static void main(String args[]){
//         int n=5;
//         int[] arr = {2,4,6,8,10};
//         int minSum = Integer.MAX_VALUE;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<n; i++){
//             for(int j=i; j<n; j++){
//                 int curr_sum = 0;
//                 for(int k=i; k<=j; k++){
//                     curr_sum+=arr[k];
//                 } 
//                 System.out.println(curr_sum);
//                 if(curr_sum>maxSum){
//                     maxSum = curr_sum;
//                 }
//                 if(curr_sum<minSum){
//                     minSum = curr_sum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("max sum"+maxSum);
//         System.out.println("min sum"+minSum);

//     }
// } O(n^2)

/* program to print sub arrays sums and also max sum(PREFIX METHOD) */
// public class practice {

//     public static void main(String args[]){
//         int[] arr = {1,-2,6,-1,3};
//         int minSum = Integer.MAX_VALUE;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length];
//         int currSum = 0;
//         prefix[0] = arr[0];
//         // calculate prefix array
//         for(int i=1; i<arr.length; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }
//         for(int i=0; i<arr.length; i++){
//             int start = i;
//             for(int j=i; j<arr.length; j++){
//                 int end = j;
//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//                 if(minSum>currSum){
//                     minSum=currSum;
//                 }
//             }
//         }
//         System.out.println("max sum:- "+maxSum);
//         System.out.println("min sum:- "+minSum);
//      }
// }

// /* Kadane's Algorithm */
// public class practice {

//     public static void main(String args[]){
//         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i=0; i<arr.length; i++){
//             currSum += arr[i];
//             if(currSum<0){
//                 currSum = 0;
//             }
//             maxSum = Math.max(currSum, maxSum);
//         }
//         System.out.println("max sum:- "+maxSum);
//     }
// }

/* Kadane's Algorithm with exception*/
// public class practice {

//     public static int Kadane(int arr[]){
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i=0; i<arr.length; i++){
//             currSum += arr[i];
//             if(currSum<0){
//                 currSum = 0;
//             }
//             maxSum = Math.max(currSum, maxSum);
//         }
//         return maxSum;
//     }

//     public static void main(String args[]){
//         int arr[] = {-5,8,-2,4,1,3};
//         int allNeg = 0;
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }
//             if(arr[i]>0){
//                 allNeg = 1;
//             }
//         }
//         int maxSum = Kadane(arr);
//         if(allNeg==0){
//             System.out.println("max sum:- "+max);
//         }else{
//             System.out.println("max sum:- "+maxSum);
//         }
//     }
// }

/* Trapping Rainwater */
public class practice {

    public static int trappedRainwater(int arr[]){
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length]; 
        int trappedRainwater = 0;
        if(arr.length >= 2){
            leftMax[0] = arr[0];
            rightMax[arr.length-1] = arr[arr.length-1];
            for(int i=1; i<arr.length; i++){
                leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
            }
            for(int i=arr.length - 2; i>=0; i--){
                rightMax[i] = Math.max(rightMax[i+1], arr[i]);
            }
            
            for(int i=0; i<arr.length; i++){
                int waterLevel = Math.min(leftMax[i],rightMax[i]);
                trappedRainwater += (waterLevel - arr[i])*1;
            }

        }
        return trappedRainwater;
    }

    public static void main(String args[]){
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(arr));
    }
}

/* Buy and sell */
// public class practice {

//     public static int buyAndSellStocks(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyPrice < prices[i]) {
//                 int profit = prices [i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int arr[] = {7,1,5,3,6,4};
//         System.out.println(buyAndSellStocks(arr));
//     }
// }

/* return true if any value appears at least twice and false if every element is distinct */
// public class practice {

//     public static boolean checkArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if (arr[i] == arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]){
//         int arr[] = {1,2,3};
//         System.out.println(checkArray(arr));

//     }
// }
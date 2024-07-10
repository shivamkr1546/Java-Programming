package PRACTICE;
// import java.util.*;
// public class practice {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:- ");
//         int a = sc.nextInt();
//         if (a>0){
//             System.out.println("Positive");
//         }else{
//             System.out.println("Negative");
//         }
//     }
// }

// public class practice {
//     public static void main(String args[]){
//         double temp = 103.5;
//         if (temp>100){
//             System.out.println(temp);
//         }else{
//             System.out.println("You don't have fever");
//         }
//     }
// }


// import java.util.*;
// public class practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the week number:- ");
//         int week = sc.nextInt();
//         switch (week) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//         }
//     }
// }

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the year:- ");
//         int year = sc.nextInt();
//         if((year%4 == 0 && year%100!=0) || year%400==0){
//             System.out.println(year +" is a leap year");
//         }else{
//             System.out.println(year +" is not a leap year");
//         }
//     }
// }


// import java.util.*;
// public class practice2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         int n;
//         int choice;
//         int evenSum=0;
//         int oddSum=0;

//         do{
//             System.out.print("Enter the number:- ");
//             n = sc.nextInt();
//             if(n%2==0){
//                 evenSum+=n;
//             }else{
//                 oddSum+=n;
//             }
//             System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
//             choice = sc.nextInt();
//         }while(choice==1);

//         System.out.println("Sum of even numbers: "+ evenSum);
//         System.out.println("Sum of odd numbers: "+ oddSum);
//     }
// }

// import java.util.*;
// public class practice2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:= ");
//         int n = sc.nextInt();
//         int f = 1;
//         for(int i=1; i<=n; i++){
//             f *= i;
//         }
//         if (n==0){
//             System.out.println("Factorial of 0 is 1");
//         }else{
//             System.out.println("Factorial of "+n+" is "+f);
//         }
//     }
// }


// import java.util.*;
// public class practice2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1; i<=10; i++){
//             System.out.println(n+" x "+i+" = "+n*i);
//         }
//     }
// }

// import java.util.Scanner;
// public class practice{
//     public static int avgNum(int a, int b, int c){
//         int avg = (a+b+c)/3;
//         return avg;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         System.out.println(avgNum(a,b,c));
//     }
// }

// import java.util.Scanner;
// public class practice{
//     public static boolean isEven(int n){
//         if(n%2==0){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(isEven(a));
//     }
// }

// import java.util.Scanner;

// public class practice {
//     public static boolean isPalindrome(int n){
//         int rev =0;
//         int myNum = n;
//         while(n>0){
//             int rem = n%10;
//             rev = rev * 10 + rem;
//             n /= 10;
//         }
//         if(myNum==rev){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static int sumNum(int n){
//         int sum = 0;
//         while(n>0){
//             int rem = n % 10;
//             sum += rem;
//             n /= 10;
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(sumNum(n));
//     }
// }

/* 1.Java program to convert ineteger numbers to binary */
// import java.util.*;
// public class practice {
//     public static int decToBin(int n){
//         int bin=0;
//         int myNum=n;
//         int pow=0;
//         while(n>0){
//             int rem = n % 2;
//             bin += (rem*(int)Math.pow(10,pow));
//             pow++;
//             n/=2;
//         }
//         return bin;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int bin = decToBin(n);
//         System.out.print("Binary of "+n+" is "+bin);
//     }
// }

/* Find the factorial of a number */

// import java.util.*;
// public class practice{
//     public static int factOfNum(int n){
//         int f=1;
//         for(int i=1; i<=n; i++){
//             f*=i;
//         }
//         return f;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int f = factOfNum(n);
//         System.out.print("Factorial of "+n+" is "+f);
//     }
// }

/* Program to print pascal's triangle in java */
// import java.util.*;
// public class practice {
//     public static void printPascal(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=0; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             int c= 1;
//             for(int j=1; j<=i; j++){
//                 System.out.print(c + " ");;
//                 c = c*(i-j)/j;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enetr the number: ");
//         int n = sc.nextInt();
//         printPascal(n);
//     }
// }

/* Print the fibonnaci series uto n numbers */
// import java.util.*;
// public class practice {
//     public static void printSeries(int n){
//         int fNum = 0;
//         int sNum = 1;
//         int sum = 0;
//         System.out.print(fNum+" "+sNum+" ");
//         for(int i=2; i<=n; i++){
//             int nNum = fNum + sNum;
//             System.out.print(nNum+" ");
//             if(i%2==0){
//                 sum+=nNum;
//             }
//             int temp = nNum;
//             fNum = sNum;
//             sNum = temp;
//         }
//         System.out.println();
//         System.out.println(sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int m = 2*n;
//         printSeries(m);
//     }
// }

/* Program to print pyramid number pattren */

// import java.util.*;
// public class practice {
//     public static void printPattern(int n){
//         for(int i=0; i<n; i++){
//             for(int j=1; j<n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<=i*2; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         printPattern(n);
//     }
// }

/* Program to print the diamond pattern */
// public class practice {
//     public static void printDiamond(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=(n-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=(2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n; i>=1; i--){
//             for(int j=0; j<=(n-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<(2*i)-1; j++){
//                 if(j==1){
//                     continue;
//                 }
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
        
//         int n = 6;
//         printDiamond(n);
//     }
// }

/* Program to sum the elements of the arrays */
// import java.util.*;
// public class practice {
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
// public class practice {

//     public static int trappedRainwater(int arr[]){
//         int leftMax[] = new int[arr.length];
//         int rightMax[] = new int[arr.length]; 
//         int trappedRainwater = 0;
//         if(arr.length >= 2){
//             leftMax[0] = arr[0];
//             rightMax[arr.length-1] = arr[arr.length-1];
//             for(int i=1; i<arr.length; i++){
//                 leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
//             }
//             for(int i=arr.length - 2; i>=0; i--){
//                 rightMax[i] = Math.max(rightMax[i+1], arr[i]);
//             }
            
//             for(int i=0; i<arr.length; i++){
//                 int waterLevel = Math.min(leftMax[i],rightMax[i]);
//                 trappedRainwater += (waterLevel - arr[i])*1;
//             }

//         }
//         return trappedRainwater;
//     }

//     public static void main(String args[]){
//         int arr[] = {4,2,0,6,3,2,5};
//         System.out.println(trappedRainwater(arr));
//     }
// }

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


/* Basic Sorting */
// public class practice {

//     public static void bubbleSort(int arr[]){
//         for(int i=0; i<arr.length - 1; i++){
//             for(int j=0; j<arr.length - 1 - i; j++){
//                 if(arr[j+1]>arr[j]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void selectionSort(int arr[]){
//         for(int i=0; i<arr.length - 1; i++){
//             int minPos = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j]>arr[minPos]){
//                     minPos = j;
//                 }
//             }
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest+1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }

//         int j = 0;
//         for(int i=count.length-1; i>=0; i--){
//             while(count[i]>0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void insertionSort(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             int curr = arr[i];
//             int prev = i - 1;
//             while(prev >=0 && arr[prev]<curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1]=curr;
//         }
//     }

//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         insertionSort(arr);
//         printArray(arr);
//      }
// }

/* 2d arrays spiral array */
public class practice {
    public static void spiralPrint(int arr[][]){
        int srow =0;
        int erow =arr.length-1;
        int scol =0;
        int ecol =arr[0].length-1;
        while(srow<=erow && scol<=ecol){
            //top
            for(int i=scol; i<=ecol; i++){
                System.out.print(arr[srow][i]+" ");
            }
            //right
            for(int j=srow+1; j<=erow; j++){
                System.out.print(arr[j][ecol]+" ");
            }
            //bottom
            for(int k=ecol-1; k>=scol; k--){
                if(scol==ecol){
                    break;
                }
                System.out.print(arr[erow][k]+" ");
            }
            //left
            for(int l=erow-1; l>=srow+1; l--){
                if(srow==erow){
                    break;
                }
                System.out.print(arr[l][scol]+" ");
            }
            srow++;
            scol++;
            erow--;
            ecol--;

        }
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},{9,1,2,3},{4,5,6,7}};
        spiralPrint(arr);
    }
}

    




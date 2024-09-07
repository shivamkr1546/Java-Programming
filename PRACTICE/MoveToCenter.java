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
// public class practice {
//     public static void spiralPrint(int arr[][]){
//         int srow =0;
//         int erow =arr.length-1;
//         int scol =0;
//         int ecol =arr[0].length-1;
//         while(srow<=erow && scol<=ecol){
//             //top
//             for(int i=scol; i<=ecol; i++){
//                 System.out.print(arr[srow][i]+" ");
//             }
//             //right
//             for(int j=srow+1; j<=erow; j++){
//                 System.out.print(arr[j][ecol]+" ");
//             }
//             //bottom
//             for(int k=ecol-1; k>=scol; k--){
//                 if(scol==ecol){
//                     break;
//                 }
//                 System.out.print(arr[erow][k]+" ");
//             }
//             //left
//             for(int l=erow-1; l>=srow+1; l--){
//                 if(srow==erow){
//                     break;
//                 }
//                 System.out.print(arr[l][scol]+" ");
//             }
//             srow++;
//             scol++;
//             erow--;
//             ecol--;

//         }
//     }

//     public static void main(String args[]){
//         int arr[][] = {{1,2,3,4},
//                         {5,6,7,8},{9,1,2,3},{4,5,6,7}};
//         spiralPrint(arr);
//     }
// }

/* move 1 to center of the array */
import java.util.Scanner;

public class MoveToCenter {

    public static void moveToCenter(int[][] arr, int i, int j) {
        // Target position for '1' is the center (2,2)
        int targetRow = 2;
        int targetCol = 2;

        // Move row-wise
        while (i != targetRow) {
            if (i > targetRow) {
                // Swap
                int temp = arr[i][j];
                arr[i][j] = arr[i - 1][j];
                arr[i - 1][j] = temp;
                i--;
            } else if (i < targetRow) {
                int temp = arr[i][j];
                arr[i][j] = arr[i + 1][j];
                arr[i + 1][j] = temp;
                i++;
            }
        }

        // Move column-wise
        while (j != targetCol) {
            if (j > targetCol) {
                // Swap
                int temp = arr[i][j];
                arr[i][j] = arr[i][j - 1];
                arr[i][j - 1] = temp;
                j--;
            } else if (j < targetCol) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][j + 1];
                arr[i][j + 1] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];

        // Input the 5x5 matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Find the position of '1' and move it to the center
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    moveToCenter(arr, i, j);
                }
            }
        }

        // Output the matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


    




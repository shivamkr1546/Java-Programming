package BASICS;
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int average = (a + b + c)/3; 
//         System.out.println("Average is: "+ average);
//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of the side: ");
//         int a = sc.nextInt();
//         int area = a*a;
//         System.out.println("Area is: "+area);
//     }
// }

// public class JavaBasics{
//     public static void main(String args[]){
//         int n=4;
//         boolean isPrime=true;
//         for(int i=2; i<=n-1; i++){
//             if(n%i==0){
//                 isPrime = false;
//             }
//         }
//         System.out.println(isPrime);
//     }
// }




// import java.util.*;
// public class JavaBasics{

//     public static boolean isPrime(int n){
//         boolean isPrime=true;
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n%i==0){
//                 isPrime = false;
//             }
//         }
//         return isPrime;
//     }

//     public static void primeInRange(int n){
//         for(int i=2; i<=n; i++){
//             if(isPrime(i)){
//                 System.out.print(i+" ");
//             }
//         }
//     }

//     public static void binToDec(int binNum){
//         int myNum = binNum;
//         int pow=0;
//         int decNum=0;
//         while(binNum > 0){
//             int lastDigit = binNum % 10;
//             decNum += (lastDigit * (int)Math.pow(2, pow));
//             pow++;
//             binNum /= 10;
//         }
//         System.out.println("decimal of "+myNum +" = "+decNum);
//     }

//     public static void decToBin(int n){
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;
         
//         while(n>0){
//             int rem = n % 2;
//             binNum += (rem * (int)Math.pow(10, pow));
//             pow++;
//             n /= 2;
//         }
//         System.out.println("binary of "+myNum+" = "+binNum);
//     }
//     public static void main(String args[]){
//         System.out.println((2>0));
//     }  
// }

import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of problems
        int n = scanner.nextInt();
        int count = 0;

        // Process each problem
        for (int i = 0; i < n; i++) {
            // Read the confidence values for the three friends
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // If at least two are sure about the solution, increment the counter
            if (a + b + c >= 2) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);

        // Close the scanner
        scanner.close();
    }
}

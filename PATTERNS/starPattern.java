package PATTERNS;

// inverted star pattern
// public class starPattern {
//     public static void main(String args[]){
//         int n = 4;
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// square star pattern
// public class starPattern {
//     public static void main(String args[]){
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=4; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// hollow square star pattern
// public class starPattern {
//     public static void main(String args[]){
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// rhombus star pattern
// public class starPattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// rectangle star pattern
// public class starPattern {
//     public static void main(String args[]){
//         int l=6;
//         int b=4;
//         for(int i=0; i<b; i++){
//             for(int j=0; j<l; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/*hollow rectangle star pattern*/
// public class starPattern {
//     public static void main(String args[]){
//         int l=6;
//         int b=4;
//         for(int i=1; i<=b; i++){
//             for(int j=1; j<=l; j++){
//                 if(i==1 || i==b || j==1 || j==l){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/* parallelogram star pattern */
// public class starPattern {
//     public static void main(String args[]){
//         int l=6;
//         int b=4;
//         for(int i=1; i<=b; i++){
//             for(int j=1; j<i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=l; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* mirrored rhombus star pattern */
// public class starPattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=n; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Triangle star pattern */
// public class starPattern {
//     public static void main(String args[]){
//         int n = 4;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Pyramid Star Pattern */
// public class starPattern {
//      public static void main(String args[]){
//         int n=4;
//         for(int i=0; i<n; i++){
//             for(int j=n-i; j>1; j--){
//                 System.out.print(" ");
//             }
//             for(int k=0; k<=i; k++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//      }
// }

/* Pyramid star pattern */
// public class starPattern {
//     public static void main(String args[]){
//        int n=4;
//        for(int i=0; i<n; i++){
//            for(int j=n; j>i+1; j--){
//                System.out.print(" ");
//            }
//            for(int k=0; k<=i*2; k++){
//             System.out.print("*");
//            }
//            System.out.println();
//        }
//     }
// }

/* Hollow Pyramid Star Pattern */
// public class starPattern {
//     public static void main(String args[]) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = n; j > i + 1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j <= i * 2; j++) {
//                 if(i==n-1){
//                     System.out.print("*");
//                 }else{
//                     if(j==0 || j>=i*2){
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/* Inverted Pyramid Star Pattern */
// public class starPattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=n; i>=1; i--){
//             for(int j=i; j<n; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Inverted Hollow Pyramid Star Pattern */
public class starPattern {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 3;
        nTriangle(n);
    }
}

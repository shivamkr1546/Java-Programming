package PATTERNS;
/* Square star pattern  */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Hollow square pattern */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/* Rhombus Star Pattern */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=0; i<n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=n; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Rectangle Star Pattern */
// public class pattern{
//     public static void main(String args[]){
//         int r=4;
//         int c=6;
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Hollow Rectangle Star Pattern */
// public class pattern{
//     public static void main(String args[]){
//         int r=4;
//         int c=6;
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 if(i==0 || i==r-1 || j==0 || j==c-1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/* Parallelogram Star Pattern */
// public class pattern{
//     public static void main(String args[]){
//         int r=4;
//         int c=6;
//         for(int i=0; i<r; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<c; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Mirrored Rhombus Star Pattern */
// public class pattern{
//     public static void main(String args[]){
//         int r=4;
//         for(int i=r; i>0; i--){
//             for(int j=1; j<i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<r; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Triangle Star Pattern */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Pyramid Star Pattern */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=0; i<n; i++){
//             for(int j=n; j>i+1; j--){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<=i*2; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Hollow Pyramid Star Pattern */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=0; i<n; i++){
//             for(int j=n; j>i+1; j--){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<=i*2; j++){
//                 if(j==0 || j==i*2 || i==0 || i==n-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/* Inverted Pyramid Star Pattern */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<(2*(n-i)-1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/* Inverted Hollow Pyramid Star Pattern */
// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         for(int i=n; i>=1; i--){
//             for(int j=i; j<n; j++){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<2*i-1; j++){
//                 if(i==n || i==1 || j==0 || j==2*i-2){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/* Half Diamond Star Pattern */
// public class pattern {
//    public static void main(String[] args) {
// 		int no=4;
// 		for (int i = 1; i <= no; i++) {
// 			for (int j = 1; j <= i; j++) 
// 				System.out.print("*");
// 			System.out.println();
// 		}
// 		for (int i = no-1; i >0; i--) {
// 			for (int j = 1; j <=i; j++) 
// 				System.out.print("*");
// 			System.out.println();
// 		}
// 	}
// }

/* Diamond Star Pattern */
// public class pattern{
//     public static void main(String args[]){
//         // first half
//         int n=5;
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
//             for(int j=1; j<=(n-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=(2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern {
//     public static void main(String args[]){
//         int n=4;
//         int totalLines = 2*n-1;
//         int space = n-1;
//         int star = 1;
//         int currentLine = 1;
//         while(currentLine<=totalLines){
//             // spaces
//             for(int i=0; i<space; i++){
//                 System.out.print("  ");
//             }

//             //stars 
//             int nTop = 1;
//             for(int i=1; i<=star; i++){
//                 System.out.print(nTop+" ");
//                 if(i<=star/2){
//                     nTop++;
//                 }else{
//                     nTop--;
//                 }
//             }

//             //next line
//             System.out.println();
//             if(currentLine<n){
//                 space--;
//                 star+=2;
//             }else{
//                 space++;
//                 star-=2;
//             }
//             currentLine++;
            

//         }
//     }
// }
public class pattern {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int start=1;
        for(int i=0; i<n; i++){
            if(i%2==0)
                start = 1;
            else
               start = 0;
            for(int j=0; j<i; j++){
                System.out.print(start+" ");
                start-=1;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=5;
        nBinaryTriangle(n);
    }
}
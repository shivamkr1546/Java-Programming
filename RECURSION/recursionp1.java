package RECURSION;


public class recursionp1 {

    //print decreasing numbers from n to 1
    public static void printDec(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    //print increasing numbers from 1 to n
    public static void printInc(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    //print factorial n
    public static int printFact(int n){
        if(n==1){
            return 1;
        }
        return n * printFact(n-1);
    }

    //print n natural number 
    public static int printNum(int n){
        if(n==1){
            return 1;
        }
        return n + printNum(n-1);
    }

    //print nth fibonacci
    public static int nthFibbo(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }return nthFibbo(n-1) + nthFibbo(n-2);
    }

    //array is sorted or not
    public static boolean isSort(int arr[],int n){
        if(n==arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1]){
            return false;
        }
        return isSort(arr,n+1);
    }

    //first occurance
    public static int firstOccurance(int arr[],int n,int key){
        if(n==arr.length-1){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
        return firstOccurance(arr, n+1, key);
    }

    //last occurance
    public static int lastOccurance(int arr[], int n, int key){
        if(n==-1){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
        return lastOccurance(arr, n-1, key);
    }

    // x^n 
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn; 
    }

    //x^n optimised
    public static int powerOptimised(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = powerOptimised(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2!=0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    // Tiling Problem
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //work vertical choice
        int fnm1 = tilingProblem(n-1);

        //work horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    // Remove Duplicate in a String
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        //base case 
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //work
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }

    }

    //Friends Pairing Problem
    public static int totalPairs(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        int fnm1 = totalPairs(n-1);

        //pairs
        int fnm2 = totalPairs(n-2);
        int pairWays = (n-1)*fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;

    }

    //Binary String Problem
    public static void printBinString(int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //work
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinString(n-1, 1, str+"1");
        }
    }

    //Find all Occurances
    public static void findAllOccurance(int arr[], int key,int n){
        if(n==arr.length){
            return;
        }
        if(arr[n]==key){
            System.out.print(n+" ");
        }
        findAllOccurance(arr, key, n+1);
    }

    //print digit in words
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigit(int n){
        if(n==0){
            return;
        }

        int lastDigit = n%10;
        printDigit(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    //Length of String
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1)) +1 ;
    }
    public static void main(String[] args){
        String str = "cover";
        System.out.println(length(str));

    }
}


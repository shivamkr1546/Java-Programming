package ARRAYLISTS;

import java.util.ArrayList;

public class PairSum1 {
    //TC - O(N^2)
    public static boolean bruteForce(ArrayList<Integer> list, int tar){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==tar){
                    return true;
                }
            }
        }
        return false;
    }

    //TC - O(N)
    public static boolean twoPointer(ArrayList<Integer> list, int tar){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==tar){
                return true;
            }
            
            if(list.get(lp)+list.get(rp)<tar){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(twoPointer(list, 11));

    }
}

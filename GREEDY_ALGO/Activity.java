package GREEDY_ALGO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity {
    public static void main(String args[]){//O(n)
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities = " + maxAct);
        for(int i=0; i<ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}

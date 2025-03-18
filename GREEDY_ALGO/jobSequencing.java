package GREEDY_ALGO;
import java.util.*;
public class jobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }


    public static void main(String args[]){
        int job[][] = {{4, 20}, {1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<job.length; i++ ){
            jobs.add(new Job(i, job[i][0], job[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit-a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i< jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs = "+seq.size());
    }
}

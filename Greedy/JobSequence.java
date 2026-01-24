// Problem Statement:
// Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline.
// It is also given that every job takes a single unit of time so the minimum possible deadline for any job is 1.
// Maximize the total profit if only job can be scheduled at a time.

// Example:
// Input: JobA = (4, 20), JobB = (1, 10), JobC = (1, 40), JobD = (1, 30)
// Output: ans = JobC, JobA

import java.util.*;
public class JobSequence {
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
    public static void main(String[] args) {
        int job_seq[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0; i<job_seq.length; i++){
            jobs.add(new Job(i, job_seq[i][0], job_seq[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit-a.profit);

        ArrayList<Integer> res_seq = new ArrayList<>();
        int time = 0;

        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                res_seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max Jobs: "+res_seq.size());
        System.out.print("Jobs Completed: ");
        for(int i=0; i<res_seq.size(); i++){
            System.out.print(res_seq.get(i)+" ");
        }
        System.out.println();
    }
}

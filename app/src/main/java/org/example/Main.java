package org.example;

public class Main {
    public static void main(String[] args) {
        JobQueue jobQueue = new JobQueue();

        Job job1 = new Job("Job1", 3);
        Job job2 = new Job("Job2", 1);
        Job job3 = new Job("Job3", 2);
        Job sortpapers4 = new Job("sorting", 10);
        Job fetchnews = new Job("newsfeteched", 5);

        jobQueue.Insert(job1);
        jobQueue.Insert(job2);
        jobQueue.Insert(job3);
        jobQueue.Insert(sortpapers4);
        jobQueue.Insert(fetchnews);

        while (!jobQueue.isEmpty()) {
            Job nextJob = jobQueue.getNextJob();
            System.out.println("Processing " + nextJob);
        }
    }
}

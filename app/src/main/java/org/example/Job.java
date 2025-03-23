package org.example;

import java.util.PriorityQueue;

public class Job implements Comparable<Job> {
  private final String name;
  private final int priority;

  Job(String name, int priority) {
    this.name = name;
    this.priority = priority;
  }

  void execute() {
    System.out.println("Running the job with name " + this.name + " and priority " + this.priority);
  }

  String getName() {
    return this.name;
  }

  int getPriority() {
    return this.priority;
  }

  @Override
  public int compareTo(Job other) {
    return Integer.compare(this.priority, other.priority);
  }

  @Override
  public String toString() {
    return "Job{name='" + name + "', priority=" + priority + "}";
  }
}

class JobQueue {
  private final PriorityQueue<Job> queue;

  public JobQueue() {
    this.queue = new PriorityQueue<>();
  }

  public void Insert(Job job) {
    queue.offer(job);
  }

  public Job getNextJob() {
    return queue.poll();
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public void runHighestPriority() {
    if (!queue.isEmpty()) {
      Job highestPriorityJob = queue.poll(); // Get the job with the highest priority
      highestPriorityJob.execute(); // Execute the job
    } else {
      System.out.println("No jobs in the queue to execute.");
    }
  }
}

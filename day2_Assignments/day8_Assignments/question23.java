package day8_Assignments;

//2.	Task Manager:
//o	Queue of tasks (String values).
//o	Add tasks, peek at the next task, and poll completed tasks

import java.util.LinkedList;
import java.util.Queue;

public class question23 {
    public static void main(String[] args) {
    
        Queue<String> tasks = new LinkedList<>();

        tasks.add("Prepare report");
        tasks.add("Email client");
        tasks.add("Update software");
        tasks.add("Backup database");
        tasks.add("Team meeting");

        System.out.println("Initial Tasks: " + tasks);

        System.out.println("Next task to do: " + tasks.peek());

        while (!tasks.isEmpty()) {
            String completedTask = tasks.poll();
            System.out.println("Completed task: " + completedTask);
            System.out.println("Remaining tasks: " + tasks);
        }
    }
}

//Completed task: Prepare report
//Remaining tasks: [Email client, Update software, Backup database, Team meeting]
//Completed task: Email client
//Remaining tasks: [Update software, Backup database, Team meeting]
//Completed task: Update software
//Remaining tasks: [Backup database, Team meeting]
//Completed task: Backup database
//Remaining tasks: [Team meeting]
//Completed task: Team meeting
//Remaining tasks: []

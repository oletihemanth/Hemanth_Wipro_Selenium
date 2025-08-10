package day7_Assignments;

//20  Create a thread that performs a simple task (like multiplication) and returns result using Callable and Future

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class example21 {
    public static void main(String[] args) {
        Callable<Integer> task = () -> {
            int a = 5, b = 4;
            return a * b; 
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(task);

        try {
        
            int result = future.get();
            System.out.println("Multiplication Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}

//Multiplication Result: 20
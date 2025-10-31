import java.util.*;
import java.util.concurrent.*;

public class TaskManager {

    public static void main(String[] args) throws Exception {
        runSynchronous();
        runAsynchronous();
        runConcurrent();
        runPrioritized();
    }

    // ---------------- Synchronous Execution ----------------
    private static void runSynchronous() {
        System.out.println("\nSynchronous Task Execution:");

        Task a = new Task("Brushing my teeth", 2000);
        Task b = new Task("Making the bed", 1500);
        Task c = new Task("Taking my PC", 3000);
        a.setMode("Synchronous");
        b.setMode("Synchronous");
        c.setMode("Synchronous");

        a.run();
        b.run();
        c.run();
    }

    // ---------------- Asynchronous Execution ----------------
    private static void runAsynchronous() throws Exception {
        System.out.println("\nAsynchronous Task Execution:");

        List<Task> tasks = Arrays.asList(
                new Task("Listening to Music", 2000),
                new Task("Eating a Snack", 1500),
                new Task("Walking on Foot", 3000)
        );
        tasks.forEach(t -> t.setMode("Asynchronous"));

        List<CompletableFuture<Void>> futures = new ArrayList<>();
        for (Task task : tasks) {
            futures.add(CompletableFuture.runAsync(task));
        }

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
    }

    // ---------------- Concurrent Execution ----------------
    private static void runConcurrent() throws InterruptedException {
        System.out.println("\nConcurrent Task Execution:");

        List<Task> tasks = Arrays.asList(
                new Task("Football", 2000),
                new Task("Basketball", 1500),
                new Task("Volleyball", 1000)
        );
        tasks.forEach(t -> t.setMode("Concurrent"));

        ExecutorService executor = Executors.newFixedThreadPool(tasks.size());
        List<Future<?>> futures = new ArrayList<>();
        for (Task t : tasks) {
            futures.add(executor.submit(t));
        }

        for (Future<?> f : futures) {
            try {
                f.get();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    // ---------------- Prioritized Execution ----------------
    private static void runPrioritized() throws InterruptedException {
        System.out.println("\nPrioritized Task Execution:");

        List<Task> tasks = Arrays.asList(
                new Task("Training my JAVA Skills Task", 3000, "HIGH"),
                new Task("Watering my Plants Task", 2000, "MEDIUM"),
                new Task("Reading a Book Task", 1500, "LOW")
        );
        tasks.forEach(t -> t.setMode("Prioritized"));

        // Sort by priority: LOW first (shortest duration), then MEDIUM, then HIGH
        tasks.sort(Comparator.comparingInt(Task::getDuration));

        ExecutorService executor = Executors.newFixedThreadPool(tasks.size());
        List<Future<?>> futures = new ArrayList<>();
        for (Task t : tasks) {
            futures.add(executor.submit(t));
        }

        for (Future<?> f : futures) {
            try {
                f.get();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}

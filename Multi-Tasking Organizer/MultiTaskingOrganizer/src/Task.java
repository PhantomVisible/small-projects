public class Task implements Runnable {
    private String taskName;
    private int duration; // in milliseconds
    private String mode;  // Synchronous / Asynchronous / Concurrent / Prioritized
    private String priority; // For prioritized tasks only

    public Task(String taskName, int duration) {
        this.taskName = taskName;
        this.duration = duration;
    }

    public Task(String taskName, int duration, String priority) {
        this.taskName = taskName;
        this.duration = duration;
        this.priority = priority;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void run() {
        try {
            String startMsg = switch (mode) {
                case "Asynchronous" -> "Task " + taskName + " started asynchronously.";
                case "Concurrent" -> "Task " + taskName + " started concurrently.";
                case "Prioritized" -> "Task " + taskName + " started with priority " + priority + ".";
                default -> "Executing Task " + taskName + "...";
            };
            System.out.println(startMsg);

            Thread.sleep(duration);

            String endMsg = switch (mode) {
                case "Asynchronous" -> "Task " + taskName + " completed asynchronously! (Duration: " + duration + " ms)";
                case "Concurrent" -> "Task " + taskName + " completed concurrently! (Duration: " + duration + " ms)";
                case "Prioritized" -> "Task " + taskName + " completed with priority " + priority + "! (Duration: " + duration + " ms)";
                default -> "Executing Task " + taskName + "... Completed! (Duration: " + duration + " ms)";
            };
            System.out.println(endMsg);

        } catch (InterruptedException e) {
            System.err.println("Task " + taskName + " interrupted.");
        }
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}

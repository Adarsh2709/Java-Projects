package SmartTaskManager;

import java.time.LocalDate;

public abstract class Task implements Comparable<Task>{
    private int id;
    private String Task_name;
    private LocalDate deadline;
    private int priority;
    private boolean completed;

    public Task(int id,String Task_name,LocalDate deadline,int priority){
        this.id = id;
        this.Task_name = Task_name;
        this.deadline = deadline;
        this.priority = priority;
        this.completed = false;
    }

    public int getPriority(){
        return priority;
    }

    public LocalDate getDeadline(){
        return deadline;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public int compareTo(Task other) {
        return this.deadline.compareTo(other.deadline);
    }

    public abstract void execute();

    @Override
    public String toString() {
        return Task_name + " | Priority: " + priority + " | Deadline: " + deadline;
    }
}

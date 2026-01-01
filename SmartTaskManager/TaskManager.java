package SmartTaskManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Task> list = new ArrayList<>();

    public void addTask(Task task){
        list.add(task);
    }
    // Check for the pending Task
    public List<Task> PendingTask(){
        return list.stream()
                .filter(t -> !t.isCompleted())
                .collect(Collectors.toList());
    }
    //Check for the Priority
    public List<Task> Prioritytest(){
        return list.stream()
                .sorted(Comparator.comparing(Task::getPriority).reversed()) // reversed as the high priority should be at first
                .collect(Collectors.toList());
    }
    //Showing ALl the tasks
    public void AllTaskshowing(){
        list.forEach(System.out::println);
    }

    public void executeAllTasks(Executor executor) {
        for (Task t : list) {
            executor.submitTask(t);
        }
    }

}

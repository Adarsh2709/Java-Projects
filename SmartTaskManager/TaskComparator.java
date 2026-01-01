package SmartTaskManager;

import SmartTaskManager.Task;

import java.util.Comparator;

public class TaskComparator {

    public static Comparator<Task> byPriorityThenDeadline() {
        return Comparator
                .comparing(Task::getPriority).reversed()
                .thenComparing(Task::getDeadline);
    }
}

package SmartTaskManager;

import java.time.LocalDate;

public class PriorityTask extends Task{

    public PriorityTask(int id, String Task_name, LocalDate deadline, int priority) {
        super(id, Task_name, deadline, priority);
    }

    @Override
    public void execute() {
        System.out.println("Executing HIGH PRIORITY Task Urgently!");
    }

}

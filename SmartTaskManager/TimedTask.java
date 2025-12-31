package SmartTaskManager;

import java.time.LocalDate;

public class TimedTask extends Task{

    public TimedTask(int id, String Task_name, LocalDate deadline, int priority) {
        super(id, Task_name, deadline, priority);
    }

    @Override
    public void execute() {
        System.out.println("Executing task at scheduled time.");
    }
}


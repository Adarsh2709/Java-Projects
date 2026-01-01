package SmartTaskManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    private ExecutorService service = Executors.newFixedThreadPool(3);

    public void submitTask(Task task){
        service.submit(() ->{
                task.execute();
                task.markCompleted();
        });
    }
    public void Shutdown(){
        service.shutdown();
    }
}

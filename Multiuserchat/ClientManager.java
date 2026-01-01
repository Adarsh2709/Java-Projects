import java.io.PrintWriter;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ClientManager {
    private static Set<PrintWriter> set = ConcurrentHashMap.newKeySet();

    public static void addClient(PrintWriter in){
        set.add(in);
    }
    public static void removeClient(PrintWriter in){
        set.remove(in);
    }

    public static void broadcast(String msg){
        for(PrintWriter pw : set){
            pw.println(msg);
        }
    }
}

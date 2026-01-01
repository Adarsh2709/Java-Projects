import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Clientread implements Runnable{
    private BufferedReader br;
    public Clientread(Socket s) throws IOException {
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }
    public void run() {
        try {
            String msg;
            while ((msg = br.readLine())!= null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

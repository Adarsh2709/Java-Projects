import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Socket s;
    private BufferedReader br;
    private PrintWriter in;

    public ClientHandler(Socket s){
        this.s = s;
    }

    public void run(){
        try{
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            in = new PrintWriter(s.getOutputStream(), true);
            ClientManager.addClient(in);

            String msg;
            while((msg=br.readLine())!=null){
                ClientManager.broadcast(msg);
            }
        }
        catch (Exception e){
            System.out.printf("Something went worng... "+e);
        }
        finally{
            ClientManager.removeClient(in);
        }
    }

}
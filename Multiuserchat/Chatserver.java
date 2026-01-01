import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Chatserver {
    public static void main(String[] args) throws IOException {
        System.out.println("...Server Started!!...");
        ServerSocket ss = new ServerSocket(9086);
        try{
            while(true){
                Socket s = ss.accept();
                System.out.println("New client connected");

                ClientHandler ch = new ClientHandler(s);
                new Thread(ch).start();
            }
        }
        catch(Exception e) {
            System.out.println("Oops!! Something went worng... \n");
        }
    }
}

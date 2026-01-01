import java.io.IOException;
import java.net.Socket;

public class Chatclient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",9086);
        new Thread(new Clientread(s)).start();
        new Thread(new Clientwrite(s)).start();
    }
}

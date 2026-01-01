import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Clientwrite implements Runnable{
    private PrintWriter out;
    public Clientwrite(Socket socket) throws IOException {
        out = new PrintWriter(
                socket.getOutputStream(), true);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            out.println(sc.nextLine());
        }
    }
}

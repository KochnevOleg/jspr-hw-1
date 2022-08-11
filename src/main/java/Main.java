import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        final int PORT = 21021;
        final int THREAD_QUANTITY = 64;

        final var server = new Server(THREAD_QUANTITY);
        server.start(PORT);
    }
}

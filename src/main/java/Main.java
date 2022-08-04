import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Server server = new Server(21021);

        ExecutorService executorService = Executors.newFixedThreadPool(64);
        executorService.submit(server::start);

        if (executorService.isTerminated()) {
            executorService.shutdownNow();
        }
    }
}

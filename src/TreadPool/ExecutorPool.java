package TreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(()->{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("true");
            }
        });
        executorService.shutdownNow();
    }
}

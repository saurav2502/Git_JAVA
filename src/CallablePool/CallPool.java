package CallablePool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> future = executorService.submit(()->{
           while (!Thread.currentThread().isInterrupted()){
               System.out.println("no");
               return;
           }
        });
        future.cancel(true);
    }
}

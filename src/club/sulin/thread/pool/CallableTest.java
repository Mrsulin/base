package club.sulin.thread.pool;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    @Test
    public void demo01() throws ExecutionException, InterruptedException {
        CallableThread ct = new CallableThread();
        FutureTask<String> task = new FutureTask<>(ct);
        new Thread(task).start();
        System.out.println(task.get());
    }


}

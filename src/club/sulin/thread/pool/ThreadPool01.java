package club.sulin.thread.pool;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Title: ThreadPool01
 */
public class ThreadPool01 {
    @Test
    public void method() throws InterruptedException {
        Long start = System.currentTimeMillis();
        System.out.println();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            };
            thread.start();
            thread.join();
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(list.size());
    }

    @Test
    public void demo2() throws InterruptedException {
        Long start=System.currentTimeMillis();
        ExecutorService service = Executors.newSingleThreadExecutor();
        Random random = new Random();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<10000;i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            });
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(list.size());

    }

}

package club.sulin.thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    @org.junit.jupiter.api.Test
    public void demo02() throws InterruptedException {
        long time = System.currentTimeMillis();
        final List<Integer> list = new ArrayList<>();
        final Random random = new Random();
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
        System.out.println(System.currentTimeMillis()-time);
    }
}

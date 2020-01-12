package club.sulin.thread.pool;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool02 {
    @Test
    public void demo01() {
        ExecutorService service = Executors.newCachedThreadPool();
//        service.execute(()-> System.out.println("启动")); //jdk8之后的写法

        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动");
            }
        });
    }

    @Test
    public void demo02(){
        ExecutorService service = Executors.newCachedThreadPool();
//        service.execute(()-> System.out.println("启动")); //jdk8之后的写法

        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动");
            }
        });
    }
}

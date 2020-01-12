package club.sulin.thread.pool;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {


    @Override
    public String call() throws Exception {
        System.out.println("call方法内部执行");
        return "call方法返回字符串";
    }
}

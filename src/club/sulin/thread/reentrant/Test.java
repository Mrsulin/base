package club.sulin.thread.reentrant;

import java.util.function.Consumer;

/**
 * Title: MyService
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Consumer<Integer>consumer=(x)-> System.out.println(x);
        consumer.accept(2);
    }

}

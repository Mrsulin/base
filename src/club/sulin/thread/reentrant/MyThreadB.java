package club.sulin.thread.reentrant;

/**
 * Title: MyThreadA
 */
public class MyThreadB extends Thread {
    private Base base;
    public MyThreadB(Base base){
        this.base=base;
    }

    @Override
    public void run() {
        while (true){
            base.get();
        }
    }
}

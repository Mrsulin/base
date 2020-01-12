package club.sulin.thread.reentrant;

/**
 * Title: MyThreadA
 */
public class MyThreadA extends Thread {
    private Base base;
    public MyThreadA(Base base){
        this.base=base;
    }

    @Override
    public void run() {
        while (true){
            base.set();
        }
    }
}

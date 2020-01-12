package club.sulin.thread.sync;

/**
 * Title: OutClassTest
 */
public class OutClassTest {
    public static void main(String[] args) {
         OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
         OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method1(innerClass2);
            }
        }, "T1");
        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method2();
            }
        },"T2");
        Thread t3 =new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method1();
            }
        }, "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}

package club.sulin.thread.sync;

/**
 * Title: OutClass
 */
public class OutClass {

    static class InnerClass1 {
        public void method1(InnerClass2 innerClass2) {
            String threadName = Thread.currentThread().getName();
            synchronized (innerClass2) {
                System.out.println(threadName + "进入InnerClass类中的method1方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i=" + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + "离开InnerClass类中的method1方法");
            }
        }

        public synchronized void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入InnerClass类中的method2方法");
            for (int j = 0; j < 10; j++) {
                System.out.println("j=" + j);
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + "离开InnerClass类中的method2方法");

        }
    }

    static class InnerClass2 {
        public synchronized void method1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "进入InnerClass2类中的method1方法");
            for (int k = 0; k < 10; k++) {
                System.out.println("k=" + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + "离开InnerClass2类中的method1方法");
        }
    }
}

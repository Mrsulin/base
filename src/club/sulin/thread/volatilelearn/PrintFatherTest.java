package club.sulin.thread.volatilelearn;

/**
 * Title: printFather
 */
public class PrintFatherTest {
    public static void main(String[] args)  {
       PrintFather print = new PrintFather();
        Thread thread = new Thread(print);
        thread.start();
        try {
            System.out.println(Thread.currentThread().getName()+"即将进入休眠");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"苏醒");
            System.out.println(Thread.currentThread().getName()+"开始改变flag状态");
            print.setFlag(false);
            System.out.println(Thread.currentThread().getName()+"将flag改为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

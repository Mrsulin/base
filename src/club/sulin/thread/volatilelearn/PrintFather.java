package club.sulin.thread.volatilelearn;

/**
 * Title: printFather
 */
public class PrintFather implements Runnable{
    private volatile boolean flag=true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void method1(){
        while (flag==true){
         /*   try {
                System.out.println(Thread.currentThread().getName()+"print");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("线程被停止了");
    }

    @Override
    public void run() {
        method1();
    }
}

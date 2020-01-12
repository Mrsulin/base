package club.sulin.thread.waitnotify;

/**
 * Title: MyService
 */
public class GetService {
    private Box box;

    public GetService(Box box) {
        super();
        this.box = box;
    }

    public void getMethod() {
        try {
            synchronized (this) {
                while (box.size() == 0) {
                    System.out.println("00000000000000000000");
                    this.wait();
                }
                box.popFirst();
            }
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkBoxStatus(){
        try {
            while (true){
                synchronized (this){
                    if(box.size()>0){
                        this.notifyAll();
                    }
                    System.out.println("get checkbox="+box.size());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

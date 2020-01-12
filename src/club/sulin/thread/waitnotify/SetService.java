package club.sulin.thread.waitnotify;

/**
 * Title: MyService
 */
public class SetService {
    private Box box;

    public SetService(Box box) {
        super();
        this.box = box;
    }

    public void setMethod() {
        try {
            synchronized (this) {
                while (box.size() == 50) {
                    System.out.println("满满满满满满满满满满");
                    this.wait();
                }
                Thread.sleep(300);
                box.add();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkBoxStatus(){
        try {
            while (true){
                synchronized (this){
                    if(box.size()<50){
                        this.notifyAll();
                    }
                    System.out.println("set checkbox="+box.size());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


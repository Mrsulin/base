package club.sulin.thread.waitnotify;

/**
 * Title: SetValueThread
 */
public class SetValueThread extends Thread{
    private SetService setService;

    public SetValueThread(SetService setService){
        this.setService=setService;
    }

    @Override
    public void run() {
        while (true){
            setService.setMethod();
        }
    }
}

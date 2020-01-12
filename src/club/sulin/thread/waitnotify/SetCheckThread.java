package club.sulin.thread.waitnotify;

/**
 * Title: SetCheckThread
 */
public class SetCheckThread extends Thread {
    private SetService setService;
    public SetCheckThread(SetService setService){
        this.setService=setService;
    }

    @Override
    public void run() {
        setService.checkBoxStatus();
    }
}

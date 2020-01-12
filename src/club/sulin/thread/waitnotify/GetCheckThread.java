package club.sulin.thread.waitnotify;

/**
 * Title: SetCheckThread
 */
public class GetCheckThread extends Thread {
    private GetService getService;
    public GetCheckThread(GetService getService){
        this.getService=getService;
    }

    @Override
    public void run() {
        getService.checkBoxStatus();
    }
}

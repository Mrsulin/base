package club.sulin.thread.waitnotify;

/**
 * Title: SetValueThread
 */
public class GetValueThread extends Thread{
    private GetService getService;

    public GetValueThread(GetService getService){
        this.getService=getService;
    }

    @Override
    public void run() {
        while (true){
            getService.getMethod();
        }
    }
}

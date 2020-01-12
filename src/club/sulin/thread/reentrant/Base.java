package club.sulin.thread.reentrant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Title: base
 */
public class Base {
    private ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private boolean hasValue;
    public void set(){
        try {
            lock.lock();
            if(hasValue==true){
                condition.await();
            }
            System.out.println("□□□");
            hasValue=true;
            condition.signal();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        try {
            lock.lock();
            if(hasValue==false){
                condition.await();
            }
            System.out.println("■■■");
            hasValue=false;
            condition.signal();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

package club.sulin.thread.waitnotify;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Box
 */
public class Box {

    private static List list = new ArrayList();

    public synchronized void add() {
        if (list.size() < 50) {
            list.add("xxx");
            System.out.println("线程："+Thread.currentThread().getName()+"执行了add操作，size大小为："+size());
        }
    }

    public synchronized void popFirst() {
        Object value = list.remove(0);
        System.out.println("线程："+Thread.currentThread().getName()+"执行了pop操作，size大小为："+size());
    }

    public synchronized int size(){
        return list.size();
    }
}


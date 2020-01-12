package club.sulin.single;

/**
 * Title: SingleTon
 *
 * @author sulin
 * @date 2019-07-31
 */
public class SingleTon {
    public static volatile SingleTon singleTon;

    private SingleTon() {
    }
    public SingleTon getInstance() {
        if (singleTon == null) {
            synchronized (SingleTon.class){
                if (singleTon==null){
                    return singleTon=new SingleTon();
                }
            }
        }
        return singleTon;
    }
}

package club.sulin.annotation;

/**
 * Title: demo1
 *
 * @author sulin
 * @date 2019-07-31
 */

public class demo1 {

    @very(age=1,name="张三",pwd="123")
    public void method1(){
        System.out.println("1111111");
    }
    @very(age=2,name="李四",pwd="456")
    public void method2(){
        System.out.println("2222222");
    }
    @very(age=3,name="王五",pwd="789")
    public void method3(){
        System.out.println("3333333");
    }

}


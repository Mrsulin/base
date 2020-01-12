package club.sulin.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Title: demo1Test
 *
 * @author sulin
 * @date 2019-07-31
 */
public class demo1Test {
    
    @Test
    public void testmethod01(){
        try {
            Class<?> aClass = Class.forName("club.sulin.annotation.demo1");
            Method[] method = aClass.getMethods();
            for (Method m:method){
                very annotation = m.getAnnotation(very.class);
                if(annotation!=null){
                    System.out.println(annotation.age()+"=="+annotation.name()+"=="+annotation.age());
                }

            }
            demo1 o = (demo1) aClass.newInstance();

            System.out.println("结束");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEquals(){
        long a=555;
        Integer b=555;
        System.out.println(b.equals(a));
    }
}
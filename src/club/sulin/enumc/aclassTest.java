package club.sulin.enumc;

import org.junit.jupiter.api.Test;

/**
 * Title: aclassTest
 *
 * @author sulin
 * @date 2019-07-31
 */
public class aclassTest {

    @Test
    public void test(){
        System.out.println(aclass.AAA);
        aclass[] values = aclass.values();
        System.out.println("******");
        for(int i=0;i<values.length;i++){
            System.out.print(values[i].compareTo(aclass.valueOf("CCC"))+"==");
        }
        System.out.print("\n");
        for(int i=0;i<values.length;i++){
//            System.out.print(aclass.values()[i].ordinal()+"==");
            System.out.print(aclass.values()[i]);

        }
    }

}

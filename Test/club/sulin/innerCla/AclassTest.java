package club.sulin.innerCla;

import org.junit.Test;

/**
 * Title: AclassTest
 *
 * @author sulin
 * @date 2019-07-12
 */
public class AclassTest {

    @Test
    public void testInnerClass(){
        Aclass aclass = new Aclass();
        Aclass.InnerClass innerClass1 = aclass.new InnerClass(null);


        Aclass.InnerClass innerClass2 = new Aclass().new InnerClass(null);
        innerClass2.printAge();
    }

}
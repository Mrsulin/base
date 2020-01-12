package club.sulin.stringtest;

import org.junit.Test;

/**
 * Title: StringPoolTest
 *
 * @author sulin
 * @date 2019-07-14
 */
public class StringPoolTest {
    @Test
    public void testStringPool() {
        String a = "sulin";
        String b = "sulin";
        System.out.println(a == b);
        System.out.println("****************");

        String c = new String("dyy");
        String d = new String("dyy");
        System.out.println(c == d);
        System.out.println("****************");

        String f = new String("pp");
        f.intern();
        String g = new String("pp");
        String h = "pp";
        System.out.println(f == g);
        System.out.println(f == h);
        System.out.println(g == h);
        System.out.println("****************");


        String aa = new String("ninini");
        String bb = "ninini";
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));
        System.out.println(aa.intern() == bb);
        System.out.println(aa.intern().equals(bb));
    }



}

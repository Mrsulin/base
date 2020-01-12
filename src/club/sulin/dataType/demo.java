package club.sulin.dataType;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;

/**
 * Title: demo
 */
public class demo {


    @Test
    public void test1() {
        Integer a=123;
        Integer b=123;
        System.out.println("Integer缓存内:"+(a==b));
        Integer a1=155;
        Integer b1=155;
        System.out.println("Integer缓存外:"+(a1==b1));  //-128~127  Integer

        Byte c=1;
        Byte d=1;
        System.out.println("-----Byte缓存:"+(c==d));    //-128~127  Byte

        Short e=11;
        Short f=11;
        System.out.println("--Short缓存内:"+(e==f));    //-128~127  Short

        Short e1=128;
        Short f1=128;
        System.out.println("--Short缓存外:"+(e1==f1));


        Long  g=11L;
        Long  h=11L;
        System.out.println("---Long缓存内:"+(g==h));

        Long  g1=144L;
        Long  h1=144L;
        System.out.println("---Long缓存外:"+(g1==h1));

        Character m=65;
        Character n=65;
        System.out.println("Character缓存内:"+(m==n));

        Character m1=15151;
        Character n1=15151;
        System.out.println("Character缓存外:"+(m1==n1));

        char m2=15151;
        char n2=15151;
        System.out.println("char:"+(m2==n2));

        Character a22 = 'A';
        Character b22 = 'A';
        System.out.println("-=-=");
        System.out.println(a22==b22);

        long s1=11l;
        long s2=22l;
        long s3=33l;
        System.out.println(s3==(s1+s2));

        Integer aaa=11;
        Integer bbb=11;
        System.out.println("aaa==bbb?"+(aaa==bbb));

        Integer aaa1=144;
        Integer bbb1=144;
        System.out.println("aaa==bbb?"+(aaa1==bbb1));

    }

    @Test
    public void demo02(){

        Integer a=Integer.valueOf(11);
        Integer b=Integer.valueOf(11);

        Integer c=new Integer(11);
        Integer d=new Integer(11);
        System.out.println(a==b);
        System.out.println(c==d);

        int a1= a.intValue();
        System.out.println("a1"+a1);
    }

    @Test
    public void demo3(){
        int a=144;
        int b=144;
        System.out.println(a==b);

        Boolean aa= Boolean.valueOf("false");
        Character s=0;
        System.out.println("s"+s);
        Character d=0;
        System.out.println("d"+d);
        System.out.println("Character:"+(s==d));
        Integer nn=Integer.valueOf(11);
        Integer mm=Integer.valueOf(11);
        System.out.print("nn和mm:");
        System.out.println(nn==mm);
        Object ee=new Object();
        Object ff=new Object();
        boolean result=ee.equals(ee==ff);
        System.out.println("result"+result);
        System.out.println("-----");
        Integer  ii=new Integer(111);
        int yy=111;
        System.out.print("ii和yy");
        System.out.println(ii==yy);
        method(1);

    }

    public  void  method (Object o){
        System.out.println(o);

    }
}

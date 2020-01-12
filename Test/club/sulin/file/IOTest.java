package club.sulin.file;

import club.sulin.collection.Person;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.Test;

import javax.management.Descriptor;
import java.io.*;
import java.net.URL;

/**
 * Title: IOTest
 *
 * @author sulin
 * @date 2019-07-14
 */
public class IOTest {
    /**
     * -@return: void
     * desc  转换流：InputsteamReader  OutputstreamWriter  是字符和字节转换的桥梁
     * -@Author:sulin @Date: 2019/7/14
     **/
    @Test
    public void testConvertIo() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * -@return: void
     * desc  测试转换流
     * -@Author:sulin @Date: 2019/7/14
     **/
    @Test
    public void testbaidu() {
        String file = "file.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        ) {
            String msg;
            while ((msg = br.readLine()) != null) {
                bw.write(msg);
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * -@return: void
     * desc  测试数据流
     * -@Author:sulin @Date: 2019/7/14
     **/
    @Test
    public void testDataIO() {
        DataOutputStream dos = null;
        ByteArrayOutputStream bao = null;
        DataInputStream dis = null;
        try {
            bao = new ByteArrayOutputStream();
            dos = new DataOutputStream(bao);
            dos.writeInt(88);
            dos.writeUTF("asdasd");
            dos.writeBoolean(false);
            dos.writeUTF("哈哈哈哈");
            dos.flush();

            byte[] bytes = bao.toByteArray();
            dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(bytes)));
            int i = dis.readInt();
            String s1 = dis.readUTF();
            boolean b = dis.readBoolean();
            String s2 = dis.readUTF();
            System.out.println(i);
            System.out.println(b);
            System.out.println(s1);
            System.out.println(s2);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * -@return: void
     * desc  序列化对象流
     * -@Author:sulin @Date: 2019/7/14
     **/
    @Test
    public void testObject() {
        Person user = new Person("某某某", 11);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fos = new FileOutputStream("person.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            fis = new FileInputStream("person.txt");
            ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            if (o instanceof Person) {
                Person p = (Person) o;
                System.out.println(o);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrintln() throws FileNotFoundException {
//        PrintStream ps = System.out;
//        ps.println("nihao");

        PrintStream ps1 = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
//        ps1.println("asdasd");

        //重定向输出端
        System.setOut(ps1);
        System.out.println("重定向语句");

        //重定向回输入端
    }


}

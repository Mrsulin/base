package club.sulin.IO;

import java.io.*;

/**
 * Title: IoTest
 */
public class IoTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Sulin\\Desktop\\序列化\\a.tasdkopasjdjo");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos);) {
            Person person = new Person("张三", 11);
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (FileInputStream fis = new FileInputStream("C:\\Users\\Sulin\\Desktop\\序列化\\a.tmp");
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis);) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

package club.sulin.collection;

import java.io.*;

/**
 * Title: IoTest
 *
 * @author sulin
 * @date 2019-07-12
 */
public class IoTest {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            String word = "";
            while (!word.equals("exit")) {
                word = br.readLine();
                bw.write(word);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

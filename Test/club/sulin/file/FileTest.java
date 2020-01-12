package club.sulin.file;

import org.junit.Test;

import java.io.File;

/**
 * Title: FileTest
 *
 * @author sulin
 * @date 2019-07-13
 */
public class FileTest {

    @Test
    public void testFile() {
        String url = "G:\\音乐";
        File file = new File(url);
//        System.out.println("exists?-----------" + file.txt.exists());
//        System.out.println("getName?-----------" + file.txt.getName());
//        System.out.println("isDirectory?------" + file.txt.isDirectory());
//        System.out.println("getParent---------" + file.txt.getParent());
//        System.out.println("getParentFile-----" + file.txt.getParentFile());
//        System.out.println("getAbsolutePath-----" + file.txt.getAbsolutePath());
//        System.out.println("getAbsoluteFile-----" + file.txt.getAbsoluteFile());

        printSrc(file, 0);

    }

    public static void printSrc(File file, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("-------");
        }
        System.out.println(file.getName());
        if (file == null || !file.exists()) {
            return;
        } else {
            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    printSrc(f, deep + 1);
                }
            }
        }
    }


    public static void newSort(int[] array, int low, int high) {
        int left = low;
        int right = high;
        int base = array[left];
        if (array.length == 0 || left > right)
            return;
        while(left<right){

            while (left < right && array[right] > array[left]) {
                right--;
            }
            while (left < right && array[left] < array[right]) {
                left++;
            }
            if(left<right){
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
            }

        }
        array[low]=array[left];
        array[left]=base;
        newSort(array,low++,left);

    }
}

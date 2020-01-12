package club.sulin.collection;

import org.junit.Test;

import java.util.Arrays;

/**
 * Title: SortTest
 *
 * @author sulin
 * @date 2019-07-12
 */
public class SortTest {

    @Test
    public void bubbleSortTest() {
        int[] array1 = {4, 7, 5, 1, 3, 6, 3};
        System.out.print("冒泡排序    ---------");
        Sort.CompareSort.bubbleSort(array1);
        System.out.print(Arrays.toString(array1));
        System.out.println("---------冒泡排序");
    }
    @Test
    public void quickSortTest() {
        int[] array2 = {4, 7, 5, 1, 3, 6, 3};
        System.out.print("快速排序    ---------");
        Sort.CompareSort.quickSort(array2,0,6);
        System.out.print(Arrays.toString(array2));
        System.out.println("---------快速排序");
    }

    @Test
    public void simpleSelectTest() {
        int[] array3 = {4, 7, 5, 1, 3, 6, 3};
        System.out.print("简单选择排序---------");
        Sort.CompareSort.simpleSelct(array3);
        System.out.print(Arrays.toString(array3));
        System.out.println("---------简单选择排序");

    }

    @Test
    public void feibobooTest(){
       int result=Sort.CompareSort.fiebobo(-1);
       System.out.println(result);
    }
}
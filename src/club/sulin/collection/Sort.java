package club.sulin.collection;

import java.util.Arrays;

/**
 * desc  :排序类
 *
 * @Date:sulin
 * @Date:
 **/
public class Sort {
    public static class CompareSort {
        /**
         * -@Param array:
         * -@Param low: 左侧坐标，0
         * -@Param high: 右侧坐标，数组长度-1
         * -@return: void
         * desc  快速排序
         * -@Author:sulin @Date: 2019/7/12
         * 原数组：[4, 7, 5, 1, 3, 6, 3]
         **/
        public static void quickSort(int[] array, int low, int high) {

            int left = low;
            int right = high;
            if (array.length <= 0 || left > right) return;
            int base = array[left];
            while (left < right) {
                while (array[right] >= base && left < right) {
                    right--;
                }
                while (array[left] <= base && left < right) {
                    left++;
                }

                if (left < right) {
                    array[left] = array[left] ^ array[right];
                    array[right] = array[left] ^ array[right];
                    array[left] = array[left] ^ array[right];
                }
            }
            array[low] = array[left];
            array[left] = base;
            quickSort(array, low, left - 1);
            quickSort(array, left + 1, high);

        }

        /**
         * -@Param array:
         * -@return: int[]
         * desc  冒泡排序
         * -@Author:sulin @Date: 2019/7/12
         **/
        public static void bubbleSort(int[] array) {
            int length = array.length;


            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length - i - 1; j++) {

                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }


        public static void simpleSelct(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                int minIndex = i;
                int temp;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] <= array[minIndex])
                        minIndex = j;
                }
                temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;

            }

        }


        public void mergeSort(int[] array) {
            int length = array.length;
            int base=length/2;
//            int left[length]=null;
            for(int i=0;i<length;i++){


            }


        }

        public static int fiebobo(int n) {
                if (n == 1 || n == 2)
                    return 1;
                return fiebobo(n - 1) + fiebobo(n - 2);
        }

    }


    /**
     * -@return: void
     * desc   异或交换变量
     * -@Author:sulin @Date: 2019/7/12
     **/
    public static void exchangeVarible() {
        int a = 10, b = 20;
        System.out.println("a:--" + a);
        System.out.println("b:--" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("*******************");
        System.out.println("*******************");
        System.out.println("a:--" + a);
        System.out.println("b:--" + b);
    }
}

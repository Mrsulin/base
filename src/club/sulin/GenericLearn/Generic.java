package club.sulin.GenericLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: Generic
 */
public class Generic <T>{

    public static void main(String[] args) {
        List<?extends Number>list= Arrays.asList(1,2,3,4,5);
        List<?super Number>list2= Arrays.asList(1,2,3,4,5);
        System.out.println(list.get(1));
        int a= list.get(2).intValue();
        System.out.println(a);


    }
}

package club.sulin.collection;

import org.junit.Test;

import java.util.*;

/**
 * Title: collectionTest
 *
 * @author sulin
 * @date 2019-07-13
 */
public class collectionTest {
    @Test
    public void testTreeMap() {
        Map<Person, Integer> map = new TreeMap<>();
        Person p1 = new Person("zs", 1);
        Person p2 = new Person("ls", 11);
        Person p3 = new Person("ww", 111);
        Person p4 = new Person("sl", 1111);
        map.put(p1, 111);
        map.put(p2, 222);
        map.put(p3, 333);
        map.put(p4, 444);
        // Integer p1_value = map.get(p3);
        // System.out.println("p1-value:>>>"+p1_value);
//        for (Person w : map.keySet()) {
//            System.out.println(w + "---" + map.get(w));
//        }
        Set<Map.Entry<Person, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Person, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
          }

    }

    @Test
    public void TestHashMap() {
        Map<Person, Integer> map = new HashMap<>();
        Person p1 = new Person("zs", 1);
        Person p2 = new Person("ls", 11);
        Person p3 = new Person("ww", 111);
        Person p4 = new Person("sl", 1111);
        map.put(p1,777);
        map.put(p2,888);
        map.put(p3,999);
        map.put(p4,1010);

        Set<Map.Entry<Person, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Person, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Person, Integer> ele = iterator.next();
            System.out.println(ele.getKey()+"*****"+ele.getValue());
        }
        System.out.println("==========================");
        Iterator<Person> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("==========================");
        Collection<Integer> values = map.values();
        System.out.println(values);

    }

    @Test
    public void TestSet() {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        for (Integer integer : set) {
            System.out.println(integer);
        }
        System.out.println("----------自定义Person类作为Key----------");
        Person p1 = new Person("张三", 333);
        Person p2 = new Person("李四", 222);
        Person p3 = new Person("王五", 111);
        Set<Person> set2 = new TreeSet<>();
        set2.add(p1);
        set2.add(p2);
        set2.add(p3);

        for (Person person : set2) {
            System.out.println(person + "******");

        }
    }

    @Test
    public void testArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());

        }
    }
}

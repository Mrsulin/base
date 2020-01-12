package club.sulin.lambda;

import java.util.function.*;

/**
 * Title: Test
 */
public class Test {

    public static void main(String[] args) {
        m1("fish", System.out::println);
        m2(5, x -> System.out.println(x + 1));
        System.out.println(m3("122", x -> Integer.parseInt(x) + 1));
        System.out.println(m4("abc", x -> x.length() > 4));
        System.out.println(m5(3, (str, num) -> str.length() == num));
    }

    public static void m1(String food, Animal animal) {
        animal.eat(food);
    }


    public static void m2(int a, Consumer<Integer> consumer) {
        consumer.accept(a);
        System.out.println("other");
    }

    public static Integer m3(String str, Function<String, Integer> function) {
        System.out.println("other");
        return function.apply(str);
    }

    public static String m4(String str, Predicate<String> predicate) {
        return predicate.test(str) ? "TTT" : "FFF";
    }

    public static String m5(int a, BiPredicate<String, Integer> predicate) {
        return predicate.test("sss", a) ? "TTT" : "FFF";
    }
}

@FunctionalInterface
interface Animal {
    public void eat(String food);

    default String aa() {
        return "aa";
    }

    static void sss() {
        System.out.println();
    }
}

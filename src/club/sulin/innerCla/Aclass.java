package club.sulin.innerCla;

/**
 * Title: Aclass
 *
 * @author sulin
 * @date 2019-07-12
 */
public class Aclass {
    private int age=1;
    public InnerClass in= new InnerClass("A类new内部类获取数据");
    public void outPrintinnerAge(){
        System.out.println(in.age);
        System.out.println(in.toString());
    }

    public class InnerClass {
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public int age=21;

        public void printAge(){
            int age=99;
            System.out.println("局部变量"+age);
            System.out.println("内部类变量"+this.age);
            System.out.println("外部类变量"+Aclass.this.age);
        }
    }
}

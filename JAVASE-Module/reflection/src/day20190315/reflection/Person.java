package day20190315.reflection;

/**
 * @author DingZhenYun
 * @create 2019-03-15 14:30
 */
@MyAnnotation(value = "dzy")
public class Person extends Creature<String> implements Comparable,MyInterface {
        public int id;
        private String name;
        int age;
        static String aaa="dzy";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id) {
            this.id = id;
        }

        private Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    //创建类时，尽量保留一个空参的构造器。
        public Person(String name) {
            this.name = name;
        }

        public Person() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public static void ss(){
            System.out.println("dddd");
        }
        public void setName(String name) {
            this.name = name;
        }
         @MyAnnotation(value = "abc123")
        public void show(){
            System.out.println("我是一个人");
        }
        private Integer display(String xx,Integer i) throws Exception{
            System.out.println("我的国籍是"+xx);
            return i;
        }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    class Bird{

    }
}

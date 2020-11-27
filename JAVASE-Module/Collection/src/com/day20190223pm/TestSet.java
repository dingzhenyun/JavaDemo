package com.day20190223pm;

import java.util.*;

/**
 * @author DingZhenYun
 * @create 2019-02-23 16:58
 */
/*
Collection接口 ：方法：①add(Object obj),addAll(Collection coll),size(),clear(),isEmpty();
				    ②remove(Object obj),removeAll(Collection coll),retainAll(Collection coll),equals(Object obj),contains(Object obj)
				        containsAll(Collection coll),hashCode()
				     ③ iterator(),toArray();
 *
 *     		|------Set接口：存储无序的，不可重复的元素。---相当于高中的“集合”概念
			>Set使用的方法基本上都是Collection接口下定义的。
			>添加进Set集合中的元素所在的类一定要重写equals() 和 hashCode()。要求重写equals() 和 hashCode()方法保持一致。
			>1.无序性：无序性！= 随机性。真正的无序性，指的是元素在底层存储的位置是无序的。
			>2.不可重复性：当向Set中添加进相同的元素的时候，后面的这个不能添加进去。
 *     				|------HashSet（主要的实现类）
					|------LinkedHashSet(是HashSet的子类，当我们遍历集合元素时，是按照添加进去的顺序实现的；频繁的遍历，较少的添加、插入操作建议选择此)
					|------TreeSet（可以按照添加进集合中的元素的指定属性进行排序）
						>要求TreeSet添加进的元素必须是同一个类的！
						>两种排序方式：自然排序：①要求添加进TreeSet中的元素所在的类implements Comparable接口
											②重写compareTo(Object obj)，在此方法内指明按照元素的哪个属性进行排序
											③向TreeSet中添加元素即可。若不实现此接口，会报运行时异常
									 定制排序：①创建一个实现Comparator接口的实现类的对象。在实现类中重写Comparator的compare(Object o1,Object o2)方法
											②在此compare()方法中指明按照元素所在类的哪个属性进行排序
											③将此实现Comparator接口的实现类的对象作为形参传递给TreeSet的构造器中
											④向TreeSet中添加元素即可。若不实现此接口，会报运行时异常
						>要求重写的compareTo()或者compare()方法与equals()和hashCode()方法保持一致。
 */
class Person implements Comparable{
    private String name;
    private Integer id;


    public Person( String name,int id) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Person() {
    }
    //当向TreeSet中添加Person类的对象时，依据此方法，确定按照那个属性排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p=(Person)o;
            int i= this.id.compareTo(p.id);
            if(i==0){
                return this.name.compareTo(p.name);
            }else
                return i;
        }
        return 0;
    }
}

public class TestSet {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(23);
        set.add("3");
        set.add(new String("2"));
        Person p=new Person("fff",23);
        Person p1=new Person("FFF",23);
        System.out.println(p.equals(p1));
        set.add(p);
        set.add(p1);
        set.add(23);
        set.add(23);
        System.out.println(set);
        System.out.println();
        method1();
    }
    public static  void method1(){
        //LinkedHashSet(是HashSet的子类，
        // 当我们遍历集合元素时，是按照添加进去的顺序实现的；频繁的遍历，较少的添加、插入操作建议选择此)
        Set set=new LinkedHashSet();
        set.add(23);
        set.add("3");
        set.add(new String("2"));
        Person p=new Person("fff",23);
        Person p1=new Person("FFF",23);
        System.out.println(p.equals(p1));
        set.add(p);
        set.add(p1);
        set.add(23);
        set.add(23);
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

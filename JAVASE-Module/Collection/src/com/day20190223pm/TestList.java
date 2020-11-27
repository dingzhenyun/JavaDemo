package com.day20190223pm;

/**
 * @author DingZhenYun
 * @create 2019-02-23 16:21
 */
/*
Collection接口 ：方法：①add(Object obj),addAll(Collection coll),size(),clear(),isEmpty();
				    ②remove(Object obj),removeAll(Collection coll),retainAll(Collection coll),equals(Object obj),contains(Object obj)
				        containsAll(Collection coll),hashCode()
				     ③ iterator(),toArray();
 *     		|------List接口：存储有序的，可以重复的元素.---相当于“动态”数组
			>新增的方法：删除remove(int index) 修改set(int index,Object obj) 获取get(int index)插入add(int index,Object obj)
			>添加进List集合中的元素（或对象）所在的类一定要重写equals()方法
 *     				|------ArrayList（主要的实现类）
					|------LinkedList（更适用于频繁的插入、删除操作）
					|------Vector（古老的实现类、线程安全的，但效率要低于ArrayList）
 *
 */
/*list相对于Collection中增加的方法：
void add(int index, Object ele)
boolean addAll(int index, Collection eles)
Object get(int index)//获取

Object remove(int index)
Object set(int index, Object ele)//设置
int indexOf(Object obj)//返回首次出现的位置，没有返回-1
int lastIndexOf(Object obj)///返回最后一次出现的位置，没有返回-1
List subList(int fromIndex, int toIndex)

 */
public class TestList {
}

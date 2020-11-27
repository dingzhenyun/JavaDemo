package com.day20190226;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author DingZhenYun
 * @create 2019-03-02 10:18
 */
/*
2. 定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。

分别创建以下方法：
public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
T get(String id)：从 map 中获取 id 对应的对象
void update(String id,T entity)：替换 map 中key为id的内容,改为 entity 对象
List<T> list()：返回 map 中存放的所有 T 对象
void delete(String id)：删除指定 id 对象

定义一个 User 类：
该类包含：private成员变量（int类型） id，age；（String 类型）name。

创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
使用 Junit 单元测试类进行测试。

 */
class DAO<T>{
    HashMap<String,T> map=null;
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list1=new ArrayList<T>();
        for(String s:map.keySet()){
            list1.add(map.get(s));
        }
        return list1;
    }
    public void delete(String id){
        map.remove(id);
    }


}

class User{
    private Integer id;
    private Integer age;
    private String name;

    public User(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (age != null ? !age.equals(user.age) : user.age != null) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TestDAO {
    public static void main(String[] args) {
        DAO<User> dao=new DAO<User>();
        dao.map=new HashMap<String, User>();
        dao.save("12",new User(20,2,"aa"));
        dao.save("13",new User(21,22,"bb"));
        dao.save("14",new User(22,22,"cc"));
        dao.save("15",new User(23,324,"dd"));
        dao.update("12",new User(20,22,"22"));
         User user=dao.get("12");
        System.out.println(user);
        dao.delete("12");
        List<User> l=dao.list();
        System.out.println(l);
     }
}

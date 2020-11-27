import java.io.Serializable;

public class People1 implements Cloneable, Serializable {
    private static final Long serialVersionUID=23143333333333333L;
    private int age;
    private String name;
    private Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("姓名："+name+"\n");
        sb.append("年龄："+age+"\n");
        sb.append("地址："+address+"\n");
        return sb.toString();

    }

    public People1(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public People1 clone(){
        People1 p1=null;
        try{
            p1=(People1)super.clone();
            p1.address=address.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return p1;
    }
}

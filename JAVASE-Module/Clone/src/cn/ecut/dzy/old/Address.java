package cn.ecut.dzy.old;

import java.io.Serializable;

public class Address implements Cloneable, Serializable {
    private static final Long serialVersionUID=2345325687989033L;
    private String state;
    private String province;
    private String city;

    @Override
    public String toString() {
        return "国家："+state+"省："+province+"城市"+city;
    }
    public Address clone(){//实现浅克隆
        Address address=null;
        try{
            address=(Address)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String state, String province, String city) {
        this.state = state;
        this.province = province;
        this.city = city;
    }
}

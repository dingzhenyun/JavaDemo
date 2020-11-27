package cn.ecut.dzy.now;/**
 * @author DingZhenYun
 * @create 2020-09-29 上午 11:24
 */

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @program: A->Teller
 * @description:
 **/
public class Teller implements Serializable {
    private String a;
    private String b;
    private String c;
    private Map<String, List<Integer>> imgMapBack = new HashMap<String, List<Integer>>();

    public String getA() {
        return a;
    }

    public Map<String, List<Integer>> getImgMapBack() {
        return imgMapBack;
    }

    public void setImgMapBack(Map<String, List<Integer>> imgMapBack) {
        this.imgMapBack = imgMapBack;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teller)) return false;
        Teller teller = (Teller) o;
        return Objects.equals(getA(), teller.getA()) &&
                Objects.equals(getB(), teller.getB()) &&
                Objects.equals(getC(), teller.getC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override
    public String toString() {
        return "Teller{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}

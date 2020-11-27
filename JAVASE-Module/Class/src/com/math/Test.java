package com.math;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author DingZhenYun
 * @create 2019-03-15 10:16
 */
public class Test {
    public static void main(String[] args) {

            BigInteger bi = new BigInteger("12433241123");
            BigDecimal bd = new BigDecimal("12435.351");
            BigDecimal bd2 = new BigDecimal("11");
            System.out.println(bi);
            // System.out.println(bd.divide(bd2));
            System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
            System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));

    }
}

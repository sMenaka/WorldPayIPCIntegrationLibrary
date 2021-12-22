package org.test.payment;

import java.math.BigDecimal;

public class Validator {
    public static boolean a1(String a1){
        return !a1.equals(null) && a1.length() > 0 && a1.length() < 30;
    }
    public static boolean a2(int a2){
        return a2 > 0 && a2 < 100;
    }
    public static boolean a3(BigDecimal a3){
        a3.setScale(2,BigDecimal.ROUND_HALF_EVEN);
        int con1Int =a3.compareTo(new BigDecimal(9999999.99).setScale(2,BigDecimal.ROUND_HALF_EVEN));
        int con2Int =a3.compareTo(new BigDecimal(0.00).setScale(2,BigDecimal.ROUND_HALF_EVEN));
        boolean con1 = con1Int == 0;
        boolean con2 = con1Int == 1;
        boolean con3 = con2Int == -1;
        boolean con4 = con2Int == 0;
        return (con4 || con1) || (con2 && con3);
    }
    public static boolean a5(int a2){
         return a2 == 2 || a2 == 3 ;
    }
    public static boolean a6(int a2){
        return a2 == 2 || a2 == 3 ;
    }
}

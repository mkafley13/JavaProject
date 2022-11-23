package day11;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbers {

    public static void main(String[] args) {

        long longValue = 374952849;

        BigInteger bigInteger = BigInteger.valueOf(374952849);

        BigInteger bigInteger1 = new BigInteger("-54375843758739754754947"); //treats string as number
        BigInteger bigInteger2 = BigInteger.ONE;

        BigInteger sum = bigInteger1.add(bigInteger2); // bigInteger1 + bigInteger2
        BigInteger mul = bigInteger1.multiply(bigInteger2);

        System.out.println(sum);

        int sign = bigInteger1.signum();
        System.out.println(sign); //shows 1 if positive and -1 if negative

        // bigInteger * (bigInteger1 + bigInteger2)
       BigInteger result = bigInteger1.add(bigInteger2).multiply(bigInteger);

       BigDecimal p = new BigDecimal("250000");
        BigDecimal t = BigDecimal.valueOf(10);
        BigDecimal r = BigDecimal.valueOf(7.13);

        // Interest = (P*T*R)/100

        BigDecimal interest = p.multiply(p).multiply(t).multiply(r).divide(new BigDecimal(100));
        System.out.println(interest);

    }
}

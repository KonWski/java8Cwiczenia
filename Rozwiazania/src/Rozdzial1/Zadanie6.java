package Rozdzial1;

import java.math.BigInteger;

/**
 * Napisz program, który oblicza silnię n! = 1*2*3*...*n, wykorzystując BigInteger.
 * Oblicz silnię 1000.
 */

public class Zadanie6 {

    public static final BigInteger odjemnik = new BigInteger("1");
    public static final BigInteger sinlniaParamIn = new BigInteger("1000");
    public static final BigInteger silniaKoniec = new BigInteger("1");

    public static void main(String[] args) {
        System.out.println("Silnia 1000 wynosi: " + silnia(sinlniaParamIn));
    }

    public static BigInteger silnia(BigInteger silniaParamIn) {
        return silniaParamIn.equals(silniaKoniec) ? silniaKoniec : silnia(silniaParamIn.subtract(odjemnik)).multiply(silniaParamIn);
    }

}

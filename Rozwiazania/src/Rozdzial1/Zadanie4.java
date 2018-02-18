package Rozdzial1;

/**
 * Napisz program wyświetlający największą i najmniejszą wartość typu double.
 * Podpowiedź: poszukaj Math.nextup w java.api
 */

public class Zadanie4 {

    public static void main (String args[]){
        float maxFloat = 0;
        while(maxFloat != Float.POSITIVE_INFINITY){
            maxFloat = Math.nextUp(maxFloat);
        }

        System.out.println(Math.nextDown(maxFloat));
        System.out.println(Float.MAX_VALUE);
    }

}

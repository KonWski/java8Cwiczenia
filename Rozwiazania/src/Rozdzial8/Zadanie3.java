package Rozdzial8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Załóżmy, że masz tablicę int[] = {1, 4, 9, 16}. Czym będzie Stream.of(wartosci)?
 * Jak otrzymać strumień wartości typu int?
 */

public class Zadanie3 {

    public static void main(String[] args){

        int[] tablica = new int[]{1, 4, 9, 16};

        //Strumień tablic(Metoda statyczna klasy Stream)
        Stream.of(tablica).forEach(s -> System.out.println(s));

        //Strumień int-ów
        IntStream.of(tablica).forEach(s -> System.out.println(s));

    }

}

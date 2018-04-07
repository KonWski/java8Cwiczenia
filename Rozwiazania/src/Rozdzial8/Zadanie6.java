package Rozdzial8;

import java.util.stream.IntStream;

/**
 * Korzystając z metody String.codePoints, zaimplementuj metodę testującą,
 * czy ciąg znaków jest słowem złożonym jedynie z liter
 * (Podpowiedź: Character.isAlphabetic)
 */

public class Zadanie6 {


    public boolean czyJedynieLitery(String ciagZnakow){

        IntStream litery = ciagZnakow.chars();
        long liczbaNieLiter = litery.filter(s -> !Character.isAlphabetic(s)).count();

        if(liczbaNieLiter > 0){
            return false;
        }else{
            return true;
        }
    }


}

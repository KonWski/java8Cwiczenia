package Rozdzial3.Zadanie4_5;

import java.util.Arrays;
import java.util.List;

/*
* Zaimplementuj statyczną metodę of w klasie IntSequence, która zwraca
* ciąg parametrów. Na przykład IntSequence(3, 1, 4, 1, 5, 9) zwraca ciąg szeciu wartości.
* Dodatkowe punkty możesz uzyskać za zwrócenie instancji wewnętrznej klasy anonimowej.
*/

public class IntSequance {

    private List<Integer> integers;

    public static IntSequance of(Integer... integers){
        return new IntSequance(integers);
    }

    private IntSequance(Integer[] integers){
        this.integers = Arrays.asList(integers);
    }

    public IntSequance(){

    }

    /*
    * Zadanie5
    *
    * Zaimplementuj statyczną metodę constant w klasie IntSequence, która zwraca nieskończony
    * ciąg stałych. Na przykład IntSequence.constant(1) zwraca wartości 1 1 1 ... w nieskończoność.
    * Dodatkowe punkty za wykonanie tego za pomocą wyrażenia lambda
    * */

    public static IntSequance constant(Integer con){

        return new IntSequance() {
            public int next() {
                return con;
            }

            public boolean hasNext() {
                return true;
            }
        };
    }
}

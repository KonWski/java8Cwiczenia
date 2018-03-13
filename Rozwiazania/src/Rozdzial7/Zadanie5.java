package Rozdzial7;

import java.util.*;

/**
 * Zaimplementuj metodę public static void zamien(List<?> list, int i, int j),
 * która zamienia elementy w zwykły sposób, jeśli typ elementów listy implementuje
 * intefejs RandomAccess, a w innym przypadku tak, by minimalizować koszt odwiedzenia
 * pozycji o indeksie i oraz j.
 */

public class Zadanie5 {

    public static List<String> listaInterfejs = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
    public static List<String> listaBez = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));


    public static void main(String[] args){

        System.out.println(listaInterfejs);
        zamienElementy(listaInterfejs, 1, 2);
        System.out.println(listaInterfejs);

        System.out.println(listaBez);
        zamienElementy(listaBez, 1, 2);
        System.out.println(listaBez);

    }

    public static void zamienElementy(List<?> lista, int i, int j){

        //Interfej Random Access oznacza, że klasa ma szybszą metodę get przy pętli niż iterator
        if(lista.get(0) instanceof RandomAccess){

            lista = metodaPomocnicza(lista, i, j);
        }else{

            //Zlozonosc obliczeniowa O(N)
            Collections.swap(lista, i, j);
        }

    }

    public static <T> List<T> metodaPomocnicza(List<T> lista, int i, int j){

        T temp = lista.get(j);
        lista.set(j, lista.get(i));
        lista.set(i, temp);
        return lista;
    }

}

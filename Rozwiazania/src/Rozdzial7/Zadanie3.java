package Rozdzial7;

import jdk.nashorn.api.tree.Tree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Jak obliczysz sumę, przecięcie i różnicę dwóch zbiorów, korzystając
 * jedynie z metod interfejsu Set i nie korzystając z pętli?
 */

public class Zadanie3 {

    public static void main(String[] args){

        Set<String> zestawZnakow1 = new HashSet<>(Arrays.asList("a", "b", "c", "d"));
        Set<String> zestawZnakow2 = new HashSet<>(Arrays.asList( "b", "e"));

        System.out.println("Zestaw1: " + zestawZnakow1);
        System.out.println("Zestaw2: " + zestawZnakow2);

        //Rozwiązanie korzsta z metod interfejsu Set
        //i można je by było zrobić operując tylko na setach

        //Jeśli chcesz dokonywać bardziej złożonych operacji, jak np. sortowanie można skorzystać z treeSet
        //Intefejs SortedSet rozszerza intefejs Set
        TreeSet<String> suma = new TreeSet<>(zestawZnakow1);
        suma.addAll(zestawZnakow2); //TreeSet może mieć tylko unikatowe wartości
        System.out.println("Suma: " + suma);

        TreeSet<String> przeciecie = new TreeSet<>(zestawZnakow1);
        przeciecie.retainAll(zestawZnakow2);
        System.out.println("Przeciecie: " + przeciecie);

        TreeSet<String> roznica1 = new TreeSet<>(zestawZnakow1);
        roznica1.removeAll(zestawZnakow2);

        TreeSet<String> roznica2 = new TreeSet<>(zestawZnakow2);
        roznica2.removeAll(zestawZnakow1);

        TreeSet<String> roznica = new TreeSet<>(roznica1);
        roznica.addAll(roznica2);
        System.out.println("Roznica: " + roznica);

    }

}

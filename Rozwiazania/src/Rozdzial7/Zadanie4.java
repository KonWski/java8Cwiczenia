package Rozdzial7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Doprowadź do sytuacji, w której zwracasz ConcurrentModificationException.
 * Co możesz zrobić, by tego uniknąć?
 */

public class Zadanie4 {

    //ConcurrentModificationException zgłaszany jest, gdy następuje próba modyfikacji
    //w momencie, gdy nie jest ona dozwolona
    public static void main(String[] args){

        nieWywolajConcurrentModificationException();

    }

    public static void wywolajConcurrentModificationException(){

        List<String> lista = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for(String str : lista){
            if(str.equals("a")){
                lista.remove(str);
            }
        }
    }

    public static void nieWywolajConcurrentModificationException(){

        List<String> lista = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iter = lista.listIterator();
        while(iter.hasNext()){
            String element = iter.next();//Metoda next() przesuwa pętlę jeden element do przodu
            if(element.equals("a")){
                iter.remove();
            }
        }
        System.out.println("Lista po zmianach: " + Arrays.toString(lista.toArray()));
    }
}

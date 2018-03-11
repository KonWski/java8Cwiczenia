package Rozdzial7;

import java.util.*;

/**
 * W tablicy typu ArrayList zawierającej ciągi znaków zamień wszystkie ciągi na zapisane wielkimi literami.
 * Wykonaj to za pomocą a) iteratora, b) pętli przechodzącej po wartościach indeksu oraz c) metody replaceAll
 */

public class Zadanie2 {

    public static void main(String args[]){

        List<String> listaZnakow = stworzListe();
        listaZnakow = metodaA(listaZnakow);
        System.out.println(Arrays.toString(listaZnakow.toArray()));

        listaZnakow = stworzListe();
        listaZnakow = metodaB(listaZnakow);
        System.out.println(Arrays.toString(listaZnakow.toArray()));

        listaZnakow = stworzListe();
        listaZnakow = metodaC(listaZnakow);
        System.out.println(Arrays.toString(listaZnakow.toArray()));

    }

    public static List<String> stworzListe(){

        List<String> generowanaLista = new ArrayList<>(Arrays.asList("domek", "DOMEK", "kasztan", "drzewko", "SOSNA"));
        return generowanaLista;
    }

    public static List<String> metodaA(List<String> listaZnakow){

        ListIterator<String> iter = listaZnakow.listIterator();
        while(iter.hasNext()){
            String ciagZnakow = iter.next();
            if(!ciagZnakow.equals(ciagZnakow.toUpperCase())){
                iter.set(ciagZnakow.toUpperCase());
            }
        }

        return listaZnakow;
    }

    public static List<String> metodaB(List<String> listaZnakow){

        for(int i = 0; i < listaZnakow.size(); i++){
            String ciagZnakow = listaZnakow.get(i);

            if(!ciagZnakow.equals(ciagZnakow.toUpperCase())){
                listaZnakow.set(i, ciagZnakow.toUpperCase());
            }
        }

        return listaZnakow;
    }

    public static List<String> metodaC(List<String> listaZnakow){

        listaZnakow.replaceAll(ciagZnakow -> {
            if(!ciagZnakow.equals(ciagZnakow.toUpperCase())){
                return ciagZnakow.toUpperCase();
            } else{
                return ciagZnakow;
            }
        });
        return listaZnakow;
    }

}

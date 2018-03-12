package Rozdzial7;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

/**
 * Napisz program wczytujący wszystkie słowa z pliku i wyświetlający liczbę wystąpień każdego ze słów
 * Użyj TreeMap<String, Integer>
 */

public class Zadanie7 {

    public static void main(String[] args) throws IOException{
        liczSlowa();
    }

    public static void liczSlowa() throws IOException{

        File plik = new File("Rozwiazania/src/plikiPomocnicze/plikTekstowy");

        List<String> listaWierszy = Files.readAllLines(plik.toPath(), Charset.defaultCharset());
        List<String> listaSlow = new ArrayList<>();

        for(int i = 0; i < listaWierszy.size(); i++){
            String[] slowa = listaWierszy.get(i).split("\\s+");
            listaSlow.addAll(Arrays.asList(slowa));
        }

        TreeMap<String, Integer> mapaCzestosciWystapien = new TreeMap<>();

        Iterator<String> iter = listaSlow.iterator();
        while(iter.hasNext()){
            String slowo = iter.next();
            //Jezeli nie znajdzie klucza slowo, to tworzy nowy klucz w mapie i daje mu wartosc 1
            //W przeciwnym wypadku do istniejacej wartosci dodaje 1
            mapaCzestosciWystapien.merge(slowo, 1, Integer::sum);
        }

        for(Map.Entry<String, Integer> slowoPetla : mapaCzestosciWystapien.entrySet()){
            System.out.println(slowoPetla.getKey() + ": " + slowoPetla.getValue());
        }

    }


}

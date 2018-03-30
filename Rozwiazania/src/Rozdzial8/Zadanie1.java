package Rozdzial8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Sprawdż, czy zapytanie o pięć długich słów spowoduje wywołanie metody filter
 * po znalezieniu piątego długiego słowa. Po prostu rejestruj każde wywołanie metody
 */

public class Zadanie1 {

    public static void main(String[] args){

        long liczbaDlugichSlow = liczSlowa();
        System.out.println("Liczba długich wyrazów w pliku tekstowym wynosi: " + liczbaDlugichSlow);

    }

    public static long liczSlowa(){

        String tresc = "";

        //Wczytujemy tresc pliku do zmiennej
        try {
            tresc = new String(Files.readAllBytes(
                    Paths.get("Rozwiazania/src/plikiPomocnicze/LoremIpsum")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Tworzymy liste slow na podstawie zaczytanej tresci
        List<String> slowa = Arrays.asList(tresc.split("\\PL+"));

        long licznik = slowa.stream()
                .filter(s -> s.length() > 5)
                .limit(5)
                .count();

        return licznik;
    }

}

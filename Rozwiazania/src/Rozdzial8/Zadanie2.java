package Rozdzial8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Zadanie2 {


    public static void main(String[] args){
        liczSlowaStream();
        liczSlowaParallesStream();
    }

    public static void liczSlowaParallesStream(){

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

        long przed = System.currentTimeMillis();

        long licznik = slowa.parallelStream()
                .filter(s -> s.length() > 5)
                .count();
        long po = System.currentTimeMillis();

        System.out.println("ParallelStream: " + (po - przed));
    }

    public static void liczSlowaStream(){

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

        long przed = System.currentTimeMillis();
        long licznik = slowa.stream()
                .filter(s -> s.length() > 5)
                .count();
        long po = System.currentTimeMillis();

        System.out.println("Stream: " + (po - przed));
    }


}

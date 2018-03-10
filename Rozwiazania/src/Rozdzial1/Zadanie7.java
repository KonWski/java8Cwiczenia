package Rozdzial1;

import java.util.Scanner;

/**
 * Napisz program, który wczytuje dwie liczby z zakresu 0 do 65 535, zapisuje je w zmiennych typu short,
 * a następnie oblicza bez znaku ich sume, iloczyn, iloraz i resztę z dzielenia bez konwertowania ich do
 * do typu int
 */

public class Zadanie7 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę.");
        Short pierwszaLiczba = scanner.nextShort();
        System.out.println("Podaj drugą liczbę.");
        Short drugaLiczba = scanner.nextShort();

        //Wszystkie operacje na liczbach całkowitych mniejszych od int będą skutkowały zmianą typu wyniku na int
        System.out.println("Wynik sumy: " + (short)(pierwszaLiczba + drugaLiczba));
        System.out.println("Wynik iloczynu: " + (short)(pierwszaLiczba * drugaLiczba));
        System.out.println("Wynik ilorazu: " + (short)(pierwszaLiczba / drugaLiczba));
        System.out.println("Wynik reszty z dzielenia: " + (short)(pierwszaLiczba % drugaLiczba) );

    }



}

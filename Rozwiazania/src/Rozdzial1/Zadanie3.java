package Rozdzial1;

import java.util.Scanner;

/**
 * Korzystając z operatora warunkowego, napisz program, który
 * wczytuje trzy liczby całkowite i wyświetla największą z nich.
 * Powtórz to samo z użyciem Math.max
 */

public class Zadanie3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą.");
        Integer liczba1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę całkowitą.");
        Integer liczba2 = scanner.nextInt();

        System.out.println("Podaj trzecią liczbę całkowitą.");
        Integer liczba3 = scanner.nextInt();

        System.out.println(max2(liczba1, liczba2, liczba3));
    }

    static Integer max(Integer liczba1, Integer liczba2, Integer liczba3){
        Integer maxWartosc = liczba1 >= liczba2 ? liczba1 : liczba2;
        maxWartosc = liczba2 >= liczba3 ? liczba2 : liczba3;

        return maxWartosc;
    }


    static Integer max2(Integer liczba1, Integer liczba2, Integer liczba3){
        return Math.max(Math.max(liczba1, liczba2), liczba3);
    }

}

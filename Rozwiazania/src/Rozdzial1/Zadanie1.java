package Rozdzial1;

import java.util.Scanner;

/**
 * Napisz program, który wczytuje zmienną całkowitą i wyświetla ją w postaci
 * binarnej, ósemkowej i szesnastkowej. Wyświetl jej odwrotność w postaci szesnastkowej liczby
 * zmiennoprzecinkowej
 */

public class Zadanie1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą.");
        Integer zmiennaCalkowita = scanner.nextInt();
        System.out.println("Postać binarna: " + Integer.toBinaryString(zmiennaCalkowita));
        System.out.println("Postać ósemkowa: " + Integer.parseInt(zmiennaCalkowita.toString(), 8));
        System.out.println("Postać szesnastkowa: " + Integer.parseInt(zmiennaCalkowita.toString(), 16));

    }


}

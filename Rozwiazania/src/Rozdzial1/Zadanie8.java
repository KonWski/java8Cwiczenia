package Rozdzial1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Napisz program, który wczytuje ciąg znaków i wyświetla wszystkie zawarte w nim
 * niepuste ciągi znaków
 */

public class Zadanie8 {

    public static void main(String[] args){

        String slowa[];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podziel się z nami swoimi przemyśleniami!");
        String przemyslenia = scanner.toString();
        slowa = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(slowa));
    }


}

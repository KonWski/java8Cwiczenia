package Rozdzial3.Zadanie3;

/*
* Jaki jest typ nadrzędny dla typu String? Dla typu Scanner? Typu ImageOutputStream?
* Zauważ, że każdy typ ma typ nadrzędny. Klasa lub interfejs bez zadeklarowanego typu nadrzędnego
* otrzymuje jako typ nadrzędny object.
*/

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args){
        System.out.println("Typ nadrzędny klasy String to: " + String.class.getSuperclass());
        System.out.println("Typ nadrzędny klasy Scanner to: " + Scanner.class.getSuperclass());
        System.out.println("Typ nadrzędny interfejsu ImageOutputStream to: " + ImageOutputStream.class.getInterfaces().getClass().getSuperclass());
    }

}

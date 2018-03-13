package Rozdzial6.Zadanie1;

import java.util.ArrayList;

/**
 * Zaimplementuj klasę Stack<E>, która zarządza tablicą typu
 * ArrayList zawierającą elementy typu E. Utwórz metody: push,
 * pop i isEmpty.
 * @param <E>
 */

public class Stack<E> {

    private ArrayList<E> lista;

    //Dodaje element na koniec listy
    public void push(E element){
        lista.add(element);
    }

    //Usuwa element z końca listy i zwraca go
    public E pop(){
        E element = lista.get(lista.size() - 1);
        lista.remove(lista.size() - 1);
        return element;
    }

    //Sprawdza, czy lista jest pusta
    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public Stack(ArrayList<E> lista) {
        this.lista = lista;
    }


    public ArrayList<E> getLista() {
        return lista;
    }

    public void setLista(ArrayList<E> lista) {
        this.lista = lista;
    }


}

package Rozdzial1;

/**
 * Co się stanie, jeśli wykonasz rzutowanie zmiennej typu double
 * do typu int w sytuacji, gdy ma ona wiekszą wartość niz największa
 * możliwa do zapisania w typie int?
 */

public class Zadanie5 {

    public static void main(String[] args){
        Double wartoscDouble = (double)Integer.MAX_VALUE;
        wartoscDouble = wartoscDouble + 10;
        System.out.println("Maksymalna wartość przyjmowana przez Integer to: " + Integer.MAX_VALUE);
        System.out.println("Konwersja wartości double większej niż " +
                "maskymalna wartość przyjmowana przez Integer do typu" +
                " Integer daje w rezultacie: " + wartoscDouble.intValue());

    }

}

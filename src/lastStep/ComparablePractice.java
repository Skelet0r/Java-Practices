package lastStep;

import java.util.Arrays;

public class ComparablePractice {

    // Def
    // Comparable and comparator both are an interface that can be used to sort the elements of the collection.
    // Comparator interface belongs to java.util package while comparable belongs to java.lang package.
    // Comparator interface sort collection using two objects provided to it,
    // while comparable interface compares" this" refers to the one objects provided to it.

    static void OrderList(String names[]) {
        Arrays.sort(names);
        for(int i  = 0; i < names.length; i++){
            System.out.println("Name: " + names[i]);
        }

        //String[] arrayNames = {"Victor", "Edgar", "Javis", "Emma", "Uncle", "Luis"};
    }

    // Notes:
    // compareTo() debe ser reciproco. Se debe cumplir: a.compareTo(b) == - b.compareTo(a) .
    // Si el método equals() de la clase que implementa la interface devuelve true, compareTo() debe devolver 0.
    // Si el objeto que se recibe por parámetro es null debe lanzar una excepción de tipo NullPointerException.
    // Esto ocurre sin hacer nada, en el momento que accedamos a algún campo del objeto null.
    // Si el objeto que se recibe como parámetro no permite ser comparado debe lanzar una excepción de tipo ClassCastException
    // (No existe un criterio común; no es de la misma clase)
}

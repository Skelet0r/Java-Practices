package lastStep;

import java.util.*;

public class IteratorPractice {

    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        list.add("Edgar");
        list.add("Gera");
        list.add("Rafa");
        list.add("Emma");
        list.add("Luis");
        list.add("Javis");

        // Creating the iterator
        Iterator<String> it = list.iterator();

        System.out.println("Using hasNext: ");

        // Conditional, we going to see if the iterator has some element
        while (it.hasNext()) {
            // If he has, we going to use next(); The iterator returns the next element
            System.out.println(it.next());
        }

        System.out.println("\nUsing forEach: ");
        for (String name : list) {
            System.out.println(name);
        }
    }
}

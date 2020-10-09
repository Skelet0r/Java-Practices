package lastStep;

import java.util.Comparator;

//public class ComparatorPractice implements Comparator {
public class ComparatorPractice implements Comparator <Person>{

    @Override
    public int compare(Person person1, Person person2)
    {
        //Person person1 = (Person) obj1;
        //Person person2 = (Person) obj2;

        return person1.getName().compareTo(person2.getName());
    }

    // Def
    // Comparable and comparator both are an interface that can be used to sort the elements of the collection.
    // Comparator interface belongs to java.util package while comparable belongs to java.lang package.
    // Comparator interface sort collection using two objects provided to it,
    // while comparable interface compares" this" refers to the one objects provided to it.
}

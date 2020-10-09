package lastStep;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        //***************************************
        // Using Comparator
        //***************************************

        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Victor", 25));
        list.add(new Person("Edgar", 24));
        list.add(new Person("Frenton", 24));
        //list.add(new Person("Messi", 32));

        // Using a class that extends from Comparator and this new class is Person type.
        //Collections.sort(list, new ComparatorPractice());

        for(Person p: list){
            System.out.println(p.getName());
        }

        // Directly, without extends but creating a new object.
        Collections.sort(list, new Comparator<Person>(){
            @Override
            public int compare(Person person1, Person person2)
            {
                int result = 0;
                if(person1.getYears() > person2.getYears()){
                    result = 1;
                } else if (person1.getYears() < person2.getYears()){
                    result = -1;
                } else {
                    result = 0;
                }
                return result;
            }
        });

        System.out.println();

        for(Person p: list){
            System.out.println(p.getName());
        }
/*
        //***************************************
        // Using Comparable
        //***************************************
        String[] arrayNames = {"Victor", "Edgar", "Javis", "Emma", "Uncle", "Luis"};

        System.out.println();
        ComparablePractice.OrderList(arrayNames);**/
    }
}

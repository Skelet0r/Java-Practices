package practices;

public class Main {

    // Variables to measure time
    static long startTime, elapsedTime;

    public static void main(String[] args) {

        //***************************************
        // Using HashMap
        //***************************************
        startTime = System.nanoTime();
        System.out.println(Using_HashMap.fillHashMap());
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("HashMap → Total execution time in millis: " + elapsedTime / 1000);
        System.out.println();

        //***************************************
        // Using ArrayList
        //***************************************
        startTime = System.nanoTime();
        System.out.println(Using_Iterator.AddElements());
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList → Total execution time in millis: " + elapsedTime / 1000);
        System.out.println();

        //***************************************
        // Using TreeSet
        //***************************************
        startTime = System.nanoTime();
        System.out.println(Using_TreeSet.fillHashMap());
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet → Total execution time in millis: " + elapsedTime / 1000);
        System.out.println();
    }
}
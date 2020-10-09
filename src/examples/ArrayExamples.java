package examples;

public class ArrayExamples {

    public static void main(String[] args) {
        // Array no literal
        int sample1 [];
        double sampleDouble [];
        String sampleString [];

        // Array de 5 posiciones
        int sample1_2 [] = new int[5];

        // Array literal
        int arrayYears [] = {1, 2, 3, 4, 5};

        // Imprimir número 3 del arreglo
        //System.out.println(arrayYears[2]);

        // Tamaño de arreglo en 4
        String [] activities = {"Crear caja fusibles", "Ensamblar fusibles", "Probar fusibles", "awfdawfdawf", "afwhjhjdshrhd"};

        //System.out.println("Primera actividad: " + activities[3]);

        // Using sample1 variable
        sample1 = new int [12];
        sample1[2] = 2;
        sample1[10] = 15;
        //System.out.println(sample1[2]);
        //System.out.println(sample1[10]);

        //System.out.println("Tamaño arreglo: " + sample1.length);

        // Inicializador - Condición - Incremento/decremento
        /*for(int i = 0; i < sample1.length; i ++) {          // 0 → 12
            System.out.println("Hola: " + activities[i]);   // 0 → 4

            // i = 0 → activities[i] → "Crear caja fusibles"
            // i = 1 → activities[i] → "Ensamblar fusibles"
            // i = 2 → activities[i] → "Probar fusibles"
            // i = 3 → activities[i] → ""

            if (i == activities.length - 1){
                i = sample1.length;
            }
        }*/

        sampleDouble = new double [5];
        //System.out.println(sampleDouble[0]);

        sampleString = new String [5];
        //System.out.println(sampleString[0]);

        int[][] sample = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9},
        };

                    //  F - C
        int x = sample [1] [2]; // X → 6

        System.out.println("X: " + x);
    }
}
package examples;

import java.util.Scanner;

public class MethodTypes
{
    int num1, num2, num3;

    int suma3num()
    {
        int suma;
        suma = num1 + num2 + num3;
        return suma;
    }

    double pi()
    {
        double pi;
        pi = Math.PI;
        return Math.PI;

    }

    boolean siesDivisible()
    {
        if (num1 % 2 == 0)
        {
            return true;
        }
        return false;
    }

    void concatenar()
    {
        String concatenar;
        concatenar = ("hola" + "mundo");
        System.out.print(concatenar);
    }

    public static void main(String[] args)
    {
        MethodTypes c = new MethodTypes();
        Scanner entrada = new Scanner(System.in);

        c.num1 = entrada.nextInt();
        c.num2 = entrada.nextInt();
        c.num3 = entrada.nextInt();
        System.out.println(c.suma3num());
        System.out.println(c.pi());
        c.num1 = entrada.nextInt();
        System.out.println(c.siesDivisible());
        c.concatenar();


    }


}
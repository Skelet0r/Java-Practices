package examples;

public class Other {

    public static void main(String[] args) {
        int n = 100; // números del 0 al N que se generará el número aleatorio
        int num = (int) (Math.random() * n) + 1;
        String a;
        System.out.println(num);
    }
}

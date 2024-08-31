package classes;

public class Counter {

    // static -> variable pertenezca a la clase y no a la instancia de la clase (objeto)
    private static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

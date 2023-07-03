package Encapsulation;

// Encapsulation is wrapping of data member and member methods in a single unit.

public class Test {
    private static int a = 12;

    static int getA() {
        return a;
    }

    public static void show() {
        System.out.println(getA());
    }

    public static void main(String[] args) {
        show();
    }

    // the private variables can be accessed by getters and setters
}

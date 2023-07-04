package Interface;
// In interfaces variables are by default public static final

// By default all the public  methods will be abstract in interface

// When we want to make interface parent so use 'implement' instead of extends  
public interface Shapes {

    int i = 34;

    public void calculatArea(int radius);

}

class Circle implements Shapes {

    @Override
    public void calculatArea(int radius) {
        System.out.println("Area of Circle is " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {

        Shapes c1 = new Circle();
        c1.calculatArea(10);
    }

}

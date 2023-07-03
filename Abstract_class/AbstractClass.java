// The concrete method is the one which contains both  method name and method body
// Abstract method is one which has only methodn name and not the body
// If a class contains atleast one abstract method then whole class will become abstract 
// Abstract class cannot be instantiated means by usinf abstract class we cannot create objects
abstract public class AbstractClass {

    // This is concrete method
    public void hello() {
        System.out.println("hello");
    }

    abstract public void cal();

    public static void main(String[] args) {

    }

}

class Start {
    public static void main(String[] args) {

    }
}
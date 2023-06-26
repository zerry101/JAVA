
public abstract class AstractClassMethods {

    public static void main(String[] args) {
        System.out.println("hii");
        child2 child=new child2();
        child.greet();
    }

    abstract public void greet();

}

 class child2 extends AstractClassMethods {
    @Override
    public void greet() {
        System.out.println("hii2");
    }

}
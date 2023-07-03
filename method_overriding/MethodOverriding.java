package method_overriding;

public class MethodOverriding {
    protected A m1() {
        System.out.println("i am m1() of method overriding ");
        return new A();
    }
}

// accessiblity preference
// public > protected > default > private
// Note : In method overriding keep accessibility of child class equal or
// greater
class Child extends MethodOverriding {

    // here B is covarient data type as it is child of A
    @Override
    public B m1() {
        System.out.println("i am override of m1()");
        return new B();
    }
}
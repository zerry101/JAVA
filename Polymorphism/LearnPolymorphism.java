package Polymorphism;

public class LearnPolymorphism {

    public void M1(int r) {
        System.out.println("This is r" + r);
    }

    public void M1(double r) {
        System.out.println("this is r " + r);
    }

}

class Child1 extends LearnPolymorphism {

}

class Main {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        LearnPolymorphism p1 = new LearnPolymorphism();

        ch1.M1(3);
        p1.M1(4.5);
    }
}
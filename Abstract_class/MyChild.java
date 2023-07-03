// The child class of abstract class will have to implement all the abstract  methods of  parent class else child class will be required to become abstract  

public class MyChild extends AbstractClass {

    @Override
    public void cal() {
        System.out.println("This is calc");
    }

}

class StartCal {

    public static void main(String[] args) {

        MyChild myChild = new MyChild();

        System.out.println("zdfsfsf");

        myChild.cal();

    }
}
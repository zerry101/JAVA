import java.util.Scanner;

public class TakingUserInput {

    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        System.out.println("enter b1");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        // System.out.println("Enter String");
        // String str = sc.next();
        // System.out.println(str);
    }
}


import java.util.Scanner;

public class ArrayIntro {

    public static void main(String[] args) {

        float[] floatArray = new float[] { 1, 2, 3, 4, 5 };

        float sum = 0;
        for (int i = 0; i < floatArray.length; i++) {
            sum += floatArray[i];
        }
        System.out.println(sum);
    }
}
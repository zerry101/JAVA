public class findELEinArray {
  public static void main(String[] args) {

    float array[] = new float[] { 23, 34, 56, 67 };
    float key = 34;
    for (float a : array) {
      if (a == key) {
        System.out.println("element found it is " + a);
      }
    }
  }
}
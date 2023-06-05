public class getavg {
    public static void main(String[] args) {
        float array[] = new float[] { 30, 30, 40 };

        float avg;
        float sum = 0;
        for (float f : array) {
            sum += f;
        }
        avg = sum / array.length;
        System.out.println("average is " + avg);

    }
}

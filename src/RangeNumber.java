public class RangeNumber {
    public static void main(String[] args) {
        double i = 0;
        while (i <= 3) {
            System.out.printf("%.1f ", i);
            i = i + 0.1;
        }
        do {
            System.out.printf("%.1f ", i);
            i = i + 0.1;
        } while (i <= 3);
    }
}


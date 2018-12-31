import java.util.Scanner;

public class CF1091_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long X = 0, Y = 0;
        for (int i = 0; i < n; i++) {
            long x = scanner.nextLong(), y = scanner.nextLong();
            X += x;
            Y += y;
        }

        for (int i = 0; i < n; i++) {
            long x = scanner.nextLong(), y = scanner.nextLong();
            X += x;
            Y += y;
        }

        X /= n;
        Y /= n;
        System.out.println(X + " " + Y);
    }
}

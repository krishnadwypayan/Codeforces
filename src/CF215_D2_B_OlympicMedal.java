import java.util.Arrays;
import java.util.Scanner;

public class CF215_D2_B_OlympicMedal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        Arrays.sort(x);

        int m = scanner.nextInt();
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = scanner.nextInt();
        }
        Arrays.sort(y);

        int k = scanner.nextInt();
        int[] z = new int[k];
        for (int i = 0; i < k; i++) {
            z[i] = scanner.nextInt();
        }
        Arrays.sort(z);

        int a = scanner.nextInt(), b = scanner.nextInt();

        double r1 = (double) (x[n-1]);
        double p1 = (double) (y[m-1]);
        double p2 = (double) (z[0]);

        double r2 = r1 * Math.sqrt((p1 * b)/(p1*b + p2*a));
        System.out.println(r2);
    }
}

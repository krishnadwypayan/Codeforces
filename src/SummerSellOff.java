import java.util.Arrays;
import java.util.Scanner;

public class SummerSellOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = scanner.nextInt();
        int f = scanner.nextInt();
        long ans = 0;
        int[] pot = new int[n];

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int l = scanner.nextInt();
            ans += Math.min(l, k);
            pot[i] = Math.min(2*k, l) - Math.min(k, l);
        }

        Arrays.sort(pot);

        int i = n-1;
        while (f > 0) {
            ans += pot[i--];
            f--;
        }

        System.out.println(ans);
    }
}

import java.util.Scanner;

public class CF327_D2_A_FlippingGame {

    private static int flipGame1(int n, int[] a) {
        // O(n^3) approach

        if (n == 1 && a[0] == 0) {
            return 1;
        }

        // If all the values are 1, we need to flip oce. Hence, return n-1
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        if (sum == n) {
            return n-1;
        }

        int ans = 0;

        for (int l = 0; l < n-1; l++) {
            for (int r = 1; r < n; r++) {
                int ones = 0;
                for (int i = l; i <= r; i++) {
                    a[i] = 1 - a[i];
                }

                for (int i = 0; i < n; i++) {
                    if (a[i] == 1) {
                        ones++;
                    }
                }

                ans = Math.max(ones, ans);

                for (int i = l; i <= r; i++) {
                    a[i] = 1 - a[i];
                }
            }
        }

        return ans;
    }

    private static int flipGame2(int n, int[] a) {
        // O(n) approach
        // Kadane's Algorithm

        int count1 = 0, extra0 = 0, mx = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count1++;
                if (extra0 > 0) {
                    extra0--;
                }
            }
            else {
                extra0++;
                mx = Math.max(mx, extra0);
            }
        }

        return count1 + mx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(flipGame2(n, a));
    }
}

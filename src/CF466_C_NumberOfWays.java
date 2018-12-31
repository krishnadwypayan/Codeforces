import java.util.Scanner;

public class CF466_C_NumberOfWays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
            sum += arr[i];
        }

        if (sum % 3 != 0) {
            System.out.print("0");
            return;
        }

        long[] cnt = new long[n];
        long s = 0;
        for (int i = n-1; i >= 0; i--) {
            s += arr[i];
            if (s == sum/3) {
                cnt[i] = 1;
            }
        }

        long[] sums = new long[n];
        s = 0;
        for (int i = n-1; i >= 0; i--) {
            s += cnt[i];
            sums[i] = s;
        }

        s = 0;
        long ans = 0;
        for (int i = 0; i+2 < n; i++) {
            s += arr[i];
            if (s == sum/3) {
                ans += sums[i+2];
            }
        }

        System.out.println(ans);
    }
}

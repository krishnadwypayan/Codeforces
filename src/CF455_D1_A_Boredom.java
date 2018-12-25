import java.util.Scanner;

public class CF455_D1_A_Boredom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] count = new int[100001];
        long[] dp = new long[100001];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            count[x]++;
        }

        dp[0] = 0;
        dp[1] = count[1];

        for (long i = 2; i <= 100000; i++) {
            dp[(int)i] = Math.max(dp[(int)(i-1)], dp[(int)(i-2)] + i*count[(int)(i)]);
        }

        System.out.println(dp[100000]);

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class CF489_B_BersuBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] boy = new int[n];
        for (int i = 0; i < n; i++) {
            boy[i] = scanner.nextInt();
        }
        Arrays.sort(boy);

        int m = scanner.nextInt();
        int[] girl = new int[m];
        for (int i = 0; i < m; i++) {
            girl[i] = scanner.nextInt();
        }
        Arrays.sort(girl);

        int[][] dp = new int[n][m];

        if (Math.abs(boy[0]-girl[0]) <= 1) {
            dp[0][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (Math.abs(boy[i] - girl[0]) <= 1) {
                dp[i][0] = 1;
            }
            else {
                dp[i][0] = dp[i-1][0];
            }
        }

        for (int i = 1; i < m; i++) {
            if (Math.abs(boy[0] - girl[i]) <= 1) {
                dp[0][i] = 1;
            }
            else {
                dp[0][i] = dp[0][i-1];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (Math.abs(boy[i] - girl[j]) <= 1) {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}

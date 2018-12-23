import java.util.Scanner;

public class CF113_D2_E_Tetrahedron {

    private static int MOD = (int) (Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] dp = new long[2][n+1];

        // End on the same vertex with no steps remaining
        dp[1][0] = 1;

        // -----------------------------------------------------------

        // For each of the steps, I need to go to other vertices from
        // either same vertex or a different vertex.
        // The following is the recurrence for this.

//        if (same == 1) {
//            ans = ( 3L * go(1-same, steps-1)) % MOD;
//        }
//        else {
//            ans = (2L * go(0, steps-1) + go(1, steps-1)) % MOD;
//        }

        // -----------------------------------------------------------

        for (int i = 1; i <= n; i++) {
            dp[1][i] = (3L * dp[0][i-1]) % MOD;
            dp[0][i] = (2L * dp[0][i-1] + dp[1][i-1]) % MOD;
        }

        System.out.println(dp[1][n]);
    }
}

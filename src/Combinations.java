import java.util.Scanner;

public class Combinations {

    private static long combine(int n, int r) {
        long[][] dp = new long[n+1][r+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }

        return dp[n][r];
    }

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        String line = null;
        while (!(line = scanner.nextLine()).isEmpty()) {
            String[] lineContents = line.split(" ");
            int n = Integer.parseInt(lineContents[0]);
            int r = Integer.parseInt(lineContents[1]);
            System.out.println(n + " things taken " + r + " at a time is " + combine(n, r) + " exactly.");
        }
    }

}

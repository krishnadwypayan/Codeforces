import java.util.Arrays;
import java.util.Scanner;

public class CF189_D2_A_CutRibbon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[4001];
        int[] cuts = new int[3];

        for (int i = 0; i <= 4000; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < 3; i++) {
            cuts[i] = scanner.nextInt();
            dp[cuts[i]] = 1;
        }

        Arrays.sort(cuts);

        for (int i = 1; i <= 4000; i++) {
            for (int j = 0; j < 3; j++) {
                if (cuts[j] > i) {
                    break;
                }
                dp[i] = Math.max(dp[i], 1 + dp[i-cuts[j]]);
            }
        }

        System.out.println(dp[n]);
    }
}

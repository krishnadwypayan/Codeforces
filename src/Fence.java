import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = Integer.MAX_VALUE;
        int ansIndex = 0;
        int sum = 0;
        int[] nums = new int[n];
        int[] sums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
            sums[i] = sum;

            if (i == k-1) {
                if (ans > sums[i]) {
                    ans = sums[i];
                    ansIndex = 1;
                }
            }
            else if (i > k-1) {
                int x = sums[i] - sums[i-k];
                if (ans > x) {
                    ans = x;
                    ansIndex = i-k+2;
                }
            }
        }

        System.out.println(ansIndex);
    }
}

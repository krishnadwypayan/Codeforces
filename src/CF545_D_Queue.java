import java.util.Arrays;
import java.util.Scanner;

public class CF545_D_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Long[] queue = new Long[n];
        for (int i = 0; i < n; i++) {
            queue[i] = scanner.nextLong();
        }

        Arrays.sort(queue);

        long sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (queue[i] >= sum) {
                ans++;
                sum += queue[i];
            }
        }

        System.out.println(ans);
    }
}

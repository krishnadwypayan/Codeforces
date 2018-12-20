import java.util.Arrays;
import java.util.Scanner;

public class TeamsForming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int ans = 0;
        for (int i = 0; i < n; i+=2) {
            ans += (Math.abs(arr[i] - arr[i+1]));
        }

        System.out.println(ans);
    }
}

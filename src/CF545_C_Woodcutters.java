import java.util.Scanner;

public class CF545_C_Woodcutters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
            h[i] = scanner.nextInt();
        }

        if (n == 1) {
            System.out.println("1");
            return;
        }

        int ans = 1;
        int left = x[0];
        for (int i = 1; i < n-1; i++) {
            if (x[i]-h[i] > left) {
                ans++;
                left = x[i];
            }
            else if (x[i]+h[i] < x[i+1]) {
                ans++;
                left = x[i]+h[i];
            }
            else {
                left = x[i];
            }
        }

        System.out.println(++ans);
    }
}

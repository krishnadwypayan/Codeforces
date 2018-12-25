import java.util.Scanner;

public class CF580_D2_A_KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int mx = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i-1]) {
                mx = Math.max(mx, ++curr);
            }
            else {
                curr = 1;
            }
        }

        System.out.println(mx);
    }
}

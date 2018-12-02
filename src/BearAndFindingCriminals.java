import java.util.Scanner;

public class BearAndFindingCriminals {

    private static int findCriminals(int n, int a, int[] vals) {
        int ans = vals[a] == 1 ? 1 : 0;

        for (int i = 1; i < n; i++) {
            if (a - i >= 0 && a + i < n && vals[a - i] == 1 && vals[a + i] == 1) {
                ans += 2 * vals[a - i] * vals[a + i];
            } else if (a - i >= 0 && a + i >= n && vals[a - i] == 1) {
                ans += 1;
            } else if (a - i < 0 && a + i < n && vals[a + i] == 1) {
                ans += 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = scanner.nextInt();
        }

        System.out.println(findCriminals(n, a-1, vals));
    }
}

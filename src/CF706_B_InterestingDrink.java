import java.util.Scanner;

public class CF706_B_InterestingDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[100001];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[x]++;
        }

        int sum = 0;
        int[] s = new int[100001];
        for (int i = 0; i < 100001; i++) {
            sum += arr[i];
            s[i] = sum;
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            if (x > 100001) {
                System.out.println(s[100000]);
            }
            else {
                System.out.println(s[x]);
            }
        }
    }
}

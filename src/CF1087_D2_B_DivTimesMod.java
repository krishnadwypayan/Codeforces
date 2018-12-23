import java.util.Scanner;

public class CF1087_D2_B_DivTimesMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int x = Integer.MAX_VALUE;

        int mod = 1;
        for (; mod < k; mod++) {
            if (n % mod == 0) {
                int div = n/mod;
                int local_x = div * k;
                local_x += mod;
                x = Math.min(x, local_x);
            }
        }

        System.out.println(x);
    }
}

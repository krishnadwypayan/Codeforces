import java.util.Scanner;

public class CF1077_A_FrogJumping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong(), b = scanner.nextLong(), k = scanner.nextLong();
            long ans = k % 2 == 0 ? (k/2 * (a-b)) : ((k/2 * (a-b)) + a);
            System.out.println(ans);
        }
    }
}

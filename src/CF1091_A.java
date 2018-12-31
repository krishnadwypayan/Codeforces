import java.util.Scanner;

public class CF1091_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt(), b = scanner.nextInt(), r = scanner.nextInt();
        int min = Math.min(y, Math.min(b, r));

        int ans = 0;
        if (min == r) {
            ans += r + r-1 + r-2;
        }
        else if (min == b) {
            r = Math.min(r, b+1);
            ans += r + r-1 + r-2;
        }
        else {
            r = Math.min(r, y+2);
            ans += r + r-1 + r-2;
        }

        System.out.println(ans);
    }
}

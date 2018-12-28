import java.util.Scanner;

public class CF1096_B {

    private static long MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();

        long ans;
        long a = 0, b = 0;

        int l = 0, r = s.length()-1;
        while (s.charAt(l) == s.charAt(0)) {
            l++;
            a++;
        }
        while (s.charAt(r) == s.charAt(n-1)) {
            r--;
            b++;
        }

        if (s.charAt(0) == s.charAt(n-1)) {
            ans = (a+1) * (b+1) % MOD;
        }
        else {
            ans = a + b + 1;
        }

        System.out.println(ans);
    }
}

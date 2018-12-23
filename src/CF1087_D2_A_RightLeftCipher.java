import java.util.Scanner;

public class CF1087_D2_A_RightLeftCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String ans = "";
        int i = 1;
        int c = s.length()/2;
        if (s.length() % 2 == 0) {
            // even
            c--;
            ans += s.charAt(c);
            while (i <= c) {
                ans += s.charAt(c+i);
                ans += s.charAt(c-i);
                i++;
            }
            ans += s.charAt(s.length()-1);
        }
        else {
            // odd
            ans += s.charAt(c);
            while (i <= c) {
                ans += s.charAt(c+i);
                ans += s.charAt(c-i);
                i++;
            }
        }

        System.out.println(ans);
    }
}

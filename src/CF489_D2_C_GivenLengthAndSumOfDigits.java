import java.util.*;

public class CF489_D2_C_GivenLengthAndSumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), s = scanner.nextInt();

        if (m == 1 && s == 0) {
            System.out.println("0 0");
            return;
        }

        // Sum of m digits cannot exceed 9*m (Max m digit number = 9999......(m times) )
        if (s < 1 || s > 9*m) {
            System.out.println("-1 -1");
            return;
        }

        String a = "", b = "";

        // Calculate the maximum possible m digit number.
        // Greedy approach to assign max(9, s) as the current digit.
        for (int i = 0; i < m; i++) {
            a += String.valueOf(Math.min(9, s));
            s -= Math.min(9, s);
        }

        // Reverse a to get the minimum number of m digits.
        for (int i = m-1; i >= 0; i--) {
            b += a.charAt(i);
        }

        // If the min number starts with 0, make it 1 and then remove this added 1
        // from the first non-zero digit.
        if (b.charAt(0) == '0') {
            for (int i = 1; i < m; i++) {
                if (b.charAt(i) != '0') {
                    char c = (char)((b.charAt(i) - '1') + '0');
                    b = '1' + b.substring(1, i) + c + b.substring(i+1);
                    break;
                }
            }
        }

        System.out.println(b + " " + a);
    }
}

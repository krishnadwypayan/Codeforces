import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class CF1091_C {

    private static long sum(long n, long d) {
        long n_ = n/d;
        long first = 1;
        long last = first + (n_ - 1)*d;
        long s = (first + last) * n_/2;
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Long> arr = new ArrayList<>();
        arr.add(1l);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                arr.add(sum(n, i));
                arr.add(sum(n, n/i));
            }
        }

        HashSet<Long> set = new HashSet<>(arr);
        arr = new ArrayList<>(set);
        Collections.sort(arr);

        for (Long a : arr) {
            System.out.print(a + " ");
        }
    }
}

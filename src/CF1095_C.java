import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CF1095_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();

        if (n == k) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print("1 ");
            }
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        int num = n;
        int x = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                arr.add((int)(Math.pow(2, x)));
            }
            x++;
            num /= 2;
        }

        if ((arr.size() > k) || k > n) {
            System.out.println("NO");
            return;
        }

        int index = 0;
        while (arr.size() < k) {
            while (arr.get(index) == 1) {
                index++;
                if (index > arr.size()) {
                    break;
                }
            }

            if (index >= arr.size()) {
                System.out.println("NO");
                return;
            }

            int val = arr.get(index);
            arr.set(index, val/2);
            arr.add(val/2);
        }

        System.out.println("YES");
        Collections.sort(arr);
        for (Integer a : arr) {
            System.out.print(a + " ");
        }
    }
}

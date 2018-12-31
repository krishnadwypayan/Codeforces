import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CF1077_C_GoodArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        HashMap<Long, Integer> cnts = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            sum += a;
            arr[i] = a;
            if (cnts.containsKey(a)) {
                int c = cnts.get(a);
                cnts.put(a, ++c);
            }
            else {
                cnts.put(a, 1);
            }
        }

        ArrayList<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long diff = sum - arr[i];
            if (diff % 2 == 0) {
                diff /= 2;
                int c = cnts.get(arr[i]);
                cnts.put(arr[i], --c);
                if (cnts.containsKey(diff) && cnts.get(diff) > 0) {
                    ansList.add(i);
                }
                cnts.put(arr[i], ++c);
            }
        }

        System.out.println(ansList.size());
        for (Integer a : ansList) {
            System.out.print(a+1 + " ");
        }
    }
}

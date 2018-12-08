import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VanyaAndLanterns {

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        ArrayList<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextLong());
        }

        Collections.sort(arr);

        double ans = (double)Math.max(arr.get(0), l - arr.get(n-1));
        for (int i = 0; i < n-1; i++) {
            ans = Math.max(ans, (double)(arr.get(i+1) - arr.get(i))/2);
        }

        System.out.print(ans);

    }

}

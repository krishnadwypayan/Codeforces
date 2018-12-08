import java.util.HashMap;
import java.util.Scanner;

public class EffectiveApproach {

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            map.put(val, i+1);
        }

        int m = scanner.nextInt();
        long leftAns = 0, rightAns = 0;

        for (int i = 0; i < m; i++) {
            int v = scanner.nextInt();
            leftAns += map.get(v);
            rightAns += (n - map.get(v) + 1);
        }

        System.out.println(leftAns + " " + rightAns);
    }

}

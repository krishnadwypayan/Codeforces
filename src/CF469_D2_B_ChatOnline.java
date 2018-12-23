import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class CF469_D2_B_ChatOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt(), q = scanner.nextInt(), l = scanner.nextInt(), r = scanner.nextInt();
        ArrayList<Pair<Integer, Integer>> Z = new ArrayList<>();
        ArrayList<Pair<Integer, Integer>> X = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            Z.add(new Pair<>(a, b));
        }

        for (int i = 0; i < q; i++) {
            int c = scanner.nextInt(), d = scanner.nextInt();
            X.add(new Pair<>(c, d));
        }

        int ans = 0;
        for (int i = l; i <= r; i++) {
            boolean possible = false;
            for (Pair<Integer, Integer> X_pair : X) {
                int xl = X_pair.getKey() + i, xr = X_pair.getValue() + i;
                for (Pair<Integer, Integer> Z_pair : Z) {
                    if (xl > Z_pair.getValue() || xr < Z_pair.getKey()) {
                        continue;
                    }

                    int left = Math.max(xl, Z_pair.getKey());
                    int right = Math.min(xr, Z_pair.getValue());
                    if (left >= Z_pair.getKey() && right <= Z_pair.getValue()) {
                        possible = true;
                        break;
                    }
                }
                if (possible) {
                    break;
                }
            }
            if (possible) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

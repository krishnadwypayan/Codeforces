import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CF186_D2_B_GrowingMushrooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), t1 = scanner.nextInt(), t2 = scanner.nextInt();
        double k = scanner.nextDouble();

        ArrayList<Pair<String, Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            double a1 = (a * t1 * (1 - k/100)) + (b * t2);
            double a2 = (a * t2) + ((1 - k/100) * b * t1);
            double ans = Math.max(a1, a2);
            String s = String.format("%.2f", ans);
            list.add(new Pair<>(s, i+1));
        }

        Collections.sort(list, Comparator.comparing(p -> -Double.parseDouble(p.getKey())));

        for (Pair<String, Integer> pair : list) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}

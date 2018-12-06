import javafx.util.Pair;

import java.util.*;

public class BurglarAndMatches {

    private static int findMatches(int n, int m, ArrayList<Pair<Integer, Integer>> arr) {
        int ans = 0;

        for (int i = 0; i < m; i++) {
            if (n > 0) {
                int box = Math.min(n, arr.get(i).getValue());
                ans += box * arr.get(i).getKey();
                n -= box;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<Pair<Integer, Integer>> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr.add(new Pair<>(b, a));
        }

        Collections.sort(arr, Comparator.comparing(p -> -p.getKey()));
        System.out.println(findMatches(n, m, arr));
    }

}

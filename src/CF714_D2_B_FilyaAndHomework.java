import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class CF714_D2_B_FilyaAndHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        if (set.size() > 3) {
            System.out.println("NO");
        }
        else if (set.size() == 3) {
            ArrayList<Integer> arr = new ArrayList<>(set);
            Collections.sort(arr);

            if ((arr.get(2) - arr.get(1)) == (arr.get(1) - arr.get(0))) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            System.out.println("YES");
        }
    }
}

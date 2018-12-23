import java.util.HashSet;
import java.util.Scanner;

public class CF400_D2_B_InnaAndNewMatrixOfCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lineContents = line.split(" ");
        int n = Integer.parseInt(lineContents[0]), m = Integer.parseInt(lineContents[1]);
        int ans = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            if (ans == -1) {
                continue;
            }

            int dwarf = str.indexOf('G');
            int candy = str.indexOf('S');
            if (dwarf <= candy) {
                set.add(candy-dwarf);
            }
            else {
                ans = -1;
            }
        }

        if (ans == -1) {
            System.out.println(ans);
        }
        else {
            System.out.println(set.size());
        }
    }
}

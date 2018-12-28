import java.util.Scanner;

public class CF313_B_IlyaAndQueries {

    // Same code accepted in C++ but not in Java. (-_-)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int[] s = new int[str.length()];
        int sum = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                sum += 1;
            }
            s[i] = sum;
        }

        int n = Integer.parseInt(scanner.nextLine());
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            int l = Integer.parseInt(line[0]), r = Integer.parseInt(line[1]);
            ans[i] = s[Math.max(0, r-1)] - s[Math.max(0, l-1)];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}

import java.util.Scanner;

public class UniformString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t != 0) {
            int n = scanner.nextInt(), k = scanner.nextInt();
            int m = n/k;
            StringBuilder ans = new StringBuilder();
            char letter = 'a';
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < m; j++) {
                    ans.append(letter);
                }
                letter = (char) (letter + 1);
            }
            while (ans.length() != n) {
                ans.append((char)(letter - 1));
            }

            System.out.println(ans.toString());

            t--;
        }
    }
}

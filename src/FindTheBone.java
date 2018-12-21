import java.util.Scanner;

public class FindTheBone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt();

        int[] holes = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            holes[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            holes[scanner.nextInt()] = 1;
        }

        int bone = 1;
        for (int i = 0; i < k; i++) {
            int u = scanner.nextInt(), v = scanner.nextInt();
            if (holes[bone] == 1) {
                continue;
            }
            if (bone == u) {
                bone = v;
            }
            else if (bone == v) {
                bone = u;
            }
        }

        System.out.println(bone);
    }
}

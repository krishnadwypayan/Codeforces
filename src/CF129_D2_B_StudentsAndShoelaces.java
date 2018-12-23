import java.util.ArrayList;
import java.util.Scanner;

public class CF129_D2_B_StudentsAndShoelaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            graph[a-1][b-1] = 1;
            graph[b-1][a-1] = 1;
        }

        int groups = 0;
        while (true) {
            ArrayList<Integer> reprimandList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (graph[i][j] == 1) {
                        count++;
                    }
                }

                if (count == 1) {
                    reprimandList.add(i);
                }
            }

            if (reprimandList.size() == 0) {
                break;
            }

            for (Integer i : reprimandList) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = 0;
                    graph[j][i] = 0;
                }
            }

            groups++;
        }

        System.out.println(groups);
    }
}

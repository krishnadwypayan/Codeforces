import java.util.HashMap;
import java.util.Scanner;

public class CF522_VK_CUP_2015_A_Reposts {

    private static HashMap<String, Integer> map;

    private static int[][] graph;

    private static int[] dp;

    private static void dfs(int curr, int par, int n) {
        dp[curr] = 1;
        int mx = 0;

        for (int i = 0; i <= n; i++) {
            if (graph[curr][i] == 1 && i != par) {
                dfs(i, curr, n);
                mx = Math.max(mx, dp[i]);
            }
        }

        dp[curr] += mx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        graph = new int[n+1][n+1];
        dp = new int[n+1];
        map = new HashMap<>();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                graph[i][j] = 0;
            }
        }

        int val = 0;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] lineContents = line.split(" ");

            int a, b;
            if (!map.containsKey(lineContents[0])) {
                a = val++;
                map.put(lineContents[0].toLowerCase(), a);
            }
            else {
                a = map.get(lineContents[0].toLowerCase());
            }

            if (!map.containsKey(lineContents[2].toLowerCase())) {
                b = val++;
                map.put(lineContents[2].toLowerCase(), b);
            }
            else {
                b = map.get(lineContents[2].toLowerCase());
            }

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(map.get("polycarp"), -1, n);
        System.out.println(dp[map.get("polycarp")]);
    }
}

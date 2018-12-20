import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightMoves {

    private static class Node {
        int x, y, moves;

        Node(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }

    private static int dfs(int curr_x, int curr_y, int end_x, int end_y) {
        int dx[]={1,1,-1,-1,2,2,-2,-2};
        int dy[]={2,-2,2,-2,1,-1,1,-1};

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(curr_x, curr_y, 0));

        while (!queue.isEmpty()) {
            Node top = queue.poll();
            if (top == null) {
                return -1;
            }

            if (top.x == end_x && top.y == end_y) {
                return top.moves;
            }

            for (int i = 0; i < 8; i++) {
                int I = top.x + dx[i];
                int J = top.y + dy[i];
                if (I >= 0 && I < 8 && J >= 0 && J < 8) {
                    queue.add(new Node(I, J, top.moves+1));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] coordinates = line.split(" ");
            int start_x = coordinates[0].charAt(0) - 'a';
            int start_y = coordinates[0].charAt(1) - '0' - 1;
            int end_x = coordinates[1].charAt(0) - 'a';
            int end_y = coordinates[1].charAt(1) - '0' - 1;

            int[][] board = new int[8][8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    board[i][j] = 0;
                }
            }

            int ans = dfs(start_x, start_y, end_x, end_y);
            System.out.println("To get from " + coordinates[0] + " to " + coordinates[1] + " takes " + ans + " knight moves.");
        }
    }
}

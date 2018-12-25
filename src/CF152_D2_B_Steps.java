import java.util.Scanner;

public class CF152_D2_B_Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int x = scanner.nextInt(), y = scanner.nextInt();
        int k = scanner.nextInt();
        long steps = 0;

        for (int i = 0; i < k; i++) {
            int dx = scanner.nextInt(), dy = scanner.nextInt();

            if (dx == 0 && dy == 0) {
                continue;
            }

            int currStep;

            if (dx == 0) {
                if (dy > 0) {
                    currStep = (m - y)/dy;
                    y += (currStep * dy);
                }
                else {
                    currStep = (1 - y)/dy;
                    y += (currStep * dy);
                }

                steps += currStep;
                continue;
            }

            if (dy == 0) {
                if (dx > 0) {
                    currStep = (n - x)/dx;
                    x += (currStep * dx);
                }
                else {
                    currStep = (1 - x)/dx;
                    x += (currStep * dx);
                }

                steps += currStep;
                continue;
            }

            int currStepX, currStepY;
            if (dx > 0) {
                currStepX = (n - x)/dx;
            }
            else {
                currStepX = (1 - x)/dx;
            }

            if (dy > 0) {
                currStepY = (m - y)/dy;
            }
            else {
                currStepY = (1 - y)/dy;
            }

            currStep = Math.min(currStepX, currStepY);
            steps += currStep;
            x += (currStep * dx);
            y += (currStep * dy);
        }

        System.out.println(steps);
    }
}

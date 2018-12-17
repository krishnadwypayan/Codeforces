import java.util.Arrays;
import java.util.Scanner;

public class DevuTheDumbGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        long[] subjects = new long[n];
        long time = 0;

        for (int i = 0; i < n; i++) {
            subjects[i] = scanner.nextInt();
        }

        Arrays.sort(subjects);

        for (int i = 0; i < n; i++) {
            time += subjects[i] * Math.max(x-i, 1);
        }

        System.out.println(time);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MahmoudAndATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        boolean found = false;
        for (int i = 1; i < n-1; i++) {
            if (arr[i-1] + arr[i] > arr[i+1]) {
                System.out.println("YES");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NO");
        }
    }
}

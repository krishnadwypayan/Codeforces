import java.util.Arrays;
import java.util.Scanner;

public class CF1095_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Math.min(arr[Math.max(0, n-2)]-arr[0], arr[n-1]-arr[1]));
    }
}

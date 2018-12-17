import java.util.Scanner;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int l = -1, r = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (l == -1 && arr[i] < arr[i-1]) {
                l = i-1;
            }
            if (l != -1 && arr[i] > arr[i-1]) {
                r = i-1;
                break;
            }
        }

        if (l != -1 && r == -1) {
            r = n-1;
        }
        else if (l == -1) {
            l = 0;
            r = 0;
        }

        int left = l, right = r;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        boolean flag = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            System.out.println("no");
        }
        else {
            left++;
            right++;
            System.out.println("yes");
            System.out.println(left + " " + right);
        }
    }
}

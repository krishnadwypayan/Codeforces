import java.util.Scanner;

public class CF699_D2_C_Vacations {

    private static int go(int n, int[] a) {
        int rest = 0;

        if (a[0] == 0) {
            rest++;
        }

        for (int i = 1; i < n; i++) {
            if (a[i] == 1 && a[i-1] == 1) {
                a[i] = 0;
                rest++;
            }
            else if (a[i] == 2 && a[i-1] == 2) {
                a[i] = 0;
                rest++;
            }
            else if (a[i] == 0) {
                rest++;
            }
            else if (a[i] == 3) {
                if (a[i-1] == 1) {
                    a[i] = 2;
                }
                else if (a[i-1] == 2) {
                    a[i] = 1;
                }
            }
        }

        return rest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(go(n, a));
    }
}

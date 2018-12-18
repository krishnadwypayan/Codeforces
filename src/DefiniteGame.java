import java.util.Scanner;

public class DefiniteGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 2) {
            for (int i = n-1; i >= 0; i--) {
                if (n % i != 0) {
                    n -= i;
                    break;
                }
            }
        }

        System.out.println(n);
    }
}

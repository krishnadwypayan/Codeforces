import java.util.ArrayList;
import java.util.Scanner;

public class CaisaAndPylons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, scanner.nextInt());
        }
        System.out.println(ans);
    }

}

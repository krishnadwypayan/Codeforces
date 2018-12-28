import java.util.Scanner;

public class CF1096_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long l = scanner.nextLong(), r = scanner.nextLong();
            System.out.println(l + " " + l*2);
        }
    }
}

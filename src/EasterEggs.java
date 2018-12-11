import java.util.Scanner;

public class EasterEggs {
    public static void main(String...args) {
        String[] rem = {"", "G", "GB", "YGB", "YGBI", "OYGBI", "OYGBIV"};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = "";
        while (n >= 7) {
            ans += "ROYGBIV";
            n -= 7;
        }
        ans += rem[n % 7];
        System.out.println(ans);
    }
}

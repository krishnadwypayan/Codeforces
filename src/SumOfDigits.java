import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        long ans = 0;

        while (num.length() > 1) {
            long sum = 0;
            for (int i = 0; i < num.length(); i++) {
                sum += (num.charAt(i) - '0');
            }
            num = String.valueOf(sum);
            ans++;
        }

        System.out.println(ans);
    }

}

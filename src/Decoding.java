import java.util.Scanner;

public class Decoding {

    private static String decode(int n, String encoding) {
        StringBuffer decoding = new StringBuffer();
        int flag = (n % 2 == 0) ? 0 : 1;

        for (int i = 0; i < n; i++) {
            if (flag == 0) {
                decoding.insert(0, encoding.charAt(i));
            }
            else {
                decoding.append(encoding.charAt(i));
            }
            flag = 1 - flag;
        }

        return decoding.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String encoding = scanner.nextLine();
        String decoding = decode(n, encoding);
        System.out.println(decoding);
    }
}

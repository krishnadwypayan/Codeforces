import java.util.Scanner;

public class CF1095_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        String s = "";
        int x = 1;
        for (int i = 0; i < n; i+=x) {
            s += str.charAt(i);
            x++;
        }

        System.out.println(s);
    }
}

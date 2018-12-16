import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        StringBuilder rev = new StringBuilder();
        rev.append(n);
        rev = rev.reverse();
        n += rev.toString();
        System.out.println(n);
    }
}

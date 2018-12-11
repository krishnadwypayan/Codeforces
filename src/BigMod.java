import java.util.Scanner;

class BigMod {

    private static long power(int b, int p, int m) {
        if (p == 0) {
            return 1;
        }

        long temp = power(b, p/2, m);
        if (p % 2 == 0) {
            return (temp * temp) % m;
        }
        return (b * temp * temp) % m;
    }

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);

        String line = null;
        while (!(line = scanner.nextLine()).isEmpty()) {
            int b = Integer.parseInt(line);
            int p = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();

            System.out.println(power(b, p, m));

        }
    }

}

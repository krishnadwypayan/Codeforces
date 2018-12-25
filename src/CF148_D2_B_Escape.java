import java.util.Scanner;

public class CF148_D2_B_Escape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vp = scanner.nextInt(), vd = scanner.nextInt(), t = scanner.nextInt(),
                f = scanner.nextInt(), c = scanner.nextInt();

        double p = vp * t * 1.0;
        int bijou = 0;
        while (true) {
            if (vp >= vd) {
                break;
            }

            p += p/(vd - vp) * vp * 1.0;
            if (p >= c) {
                break;
            }

            bijou++;
            double tx = (p/vd + f) * 1.0;
            p += (vp * tx * 1.0);
        }

        System.out.println(bijou);
    }
}

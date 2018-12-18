import java.util.Scanner;

public class ColorfulField {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), k = scanner.nextInt(), t = scanner.nextInt();
        int[] waste_i = new int[k];
        int[] waste_j = new int[k];
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            waste_i[i] = a-1;
            waste_j[i] = b-1;
        }

        String[] crops = {"Carrots", "Kiwis", "Grapes"};

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            int I = (a-1)*m + (b-1);
            int J = 0;
            boolean wasteFlag = false;
            for (int j = 0; j < k; j++) {
                if (waste_i[j] == a-1 && waste_j[j] == b-1) {
                    wasteFlag = true;
                    break;
                }
                if (waste_i[j] < a-1 || (waste_i[j] == a-1 && waste_j[j] < b-1)) {
                    J++;
                }
            }

            if (wasteFlag) {
                System.out.println("Waste");
            }
            else {
                int index = (I - J) % 3;
                System.out.println(crops[index]);
            }
        }
    }
}

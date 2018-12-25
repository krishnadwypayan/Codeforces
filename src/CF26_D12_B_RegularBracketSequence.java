import java.util.Scanner;

public class CF26_D12_B_RegularBracketSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seq = scanner.nextLine();

        int open = 0;
        int currLen = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                open++;
            }
            else {
                if (open == 0) {
                    continue;
                }
                open--;
                currLen += 2;
            }
        }

        System.out.println(currLen);
    }
}

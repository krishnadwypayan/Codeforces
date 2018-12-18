import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Keyboard {

    private static double dist(int a, int b, int c, int d) {
        return (Math.sqrt(Math.pow(a-c, 2) + Math.pow(b-d, 2)));
    }

    private static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    private static int countChanges(int inputLen, String input, char[][] keyboard, int n, int m, int x) {

        HashMap<Character, ArrayList<Pair<Integer, Integer>>> keyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (keyMap.containsKey(keyboard[i][j])) {
                    ArrayList<Pair<Integer, Integer>> keyList = keyMap.get(keyboard[i][j]);
                    keyList.add(new Pair<>(i, j));
                    keyMap.put(keyboard[i][j], keyList);
                }
                else {
                    ArrayList<Pair<Integer, Integer>> keyList = new ArrayList<>();
                    keyList.add(new Pair<>(i, j));
                    keyMap.put(keyboard[i][j], keyList);
                }
            }
        }

        HashMap<Character, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < inputLen; i++) {
            int count = 1;
            if (inputMap.containsKey(input.charAt(i))) {
                count = inputMap.get(input.charAt(i));
                count++;
            }
            inputMap.put(input.charAt(i), count);
        }

        int ans = 0;
        int c = 0;
        for (char ch : inputMap.keySet()) {

            c += inputMap.get(ch);

            char lower = ch;
            if (!isLowerCase(ch)) {
                lower = (char) (ch - 'A' + 'a');
            }

            if (!keyMap.containsKey(lower)) {
                return -1;
            }

            if (!isLowerCase(ch)) {
                if (!keyMap.containsKey('S')) {
                    return -1;
                }

                ArrayList<Pair<Integer, Integer>> shift = keyMap.get('S');
                ArrayList<Pair<Integer, Integer>> charList = keyMap.get(lower);

                double d = Double.MAX_VALUE;
                for (Pair<Integer, Integer> aShift : shift) {
                    for (Pair<Integer, Integer> aCharList : charList) {
                        d = Math.min(d, dist(aShift.getKey(), aShift.getValue(), aCharList.getKey(), aCharList.getValue()));
                    }
                }

                if (d > x) {
                    ans += inputMap.get(ch);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), x = scanner.nextInt();
        scanner.nextLine();
        char[][] keyboard = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                keyboard[i][j] = line.charAt(j);
            }
        }

        int inputLen = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        System.out.println(countChanges(inputLen, input, keyboard, n, m, x));
    }
}

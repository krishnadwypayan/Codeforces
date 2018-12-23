import java.util.HashSet;
import java.util.Scanner;

public class CF476_D2_B_DreamoonAndWiFi {

    private static HashSet<String> stringsSet;

    private static int findStringValue(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                ans++;
            }
            else {
                ans--;
            }
        }

        return ans;
    }

    private static void generateStrings(int len, int index, String currString) {
        if (index == len) {
            stringsSet.add(currString);
            return;
        }

        if (currString.charAt(index) == '?') {
            String plus = currString.substring(0, index) + "+" + currString.substring(index+1, len);
            generateStrings(len, index+1, plus);

            String minus = currString.substring(0, index) + "-" + currString.substring(index+1, len);
            generateStrings(len, index+1, minus);
        }
        else {
            generateStrings(len, index+1, currString);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int originalAns = findStringValue(s1);
        stringsSet = new HashSet<>();

        generateStrings(s1.length(), 0, s2);

        double count = 0;
        for (String s : stringsSet) {
            int ans = findStringValue(s);
            if (ans == originalAns) {
                count++;
            }
        }

        count = count / stringsSet.size();
        System.out.println(count);
    }
}

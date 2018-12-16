import java.util.HashSet;
import java.util.Scanner;

public class PresidentsOffice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lineContents = line.split(" ");
        int n = Integer.parseInt(lineContents[0]);
        int m = Integer.parseInt(lineContents[1]);
        char pres = lineContents[2].charAt(0);

        char[][] config = new char[n][m];

        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                config[i][j] = row.charAt(j);
            }
        }

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (config[i][j] == pres) {

                    if (i > 0 && config[i-1][j] != pres && config[i-1][j] != '.') {
                        set.add(config[i - 1][j]);
                    }

                    if (j > 0 && config[i][j-1] != pres && config[i][j-1] != '.') {
                        set.add(config[i][j-1]);
                    }


                    if (i < n-1 && config[i+1][j] != pres && config[i+1][j] != '.') {
                        set.add(config[i+1][j]);
                    }

                    if (j < m-1 && config[i][j+1] != pres && config[i][j+1] != '.') {
                        set.add(config[i][j+1]);
                    }

                }
            }
        }

        System.out.println(set.size());
    }

}

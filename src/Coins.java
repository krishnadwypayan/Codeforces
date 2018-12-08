import java.util.*;

public class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('A', 0);
        mp.put('B', 0);
        mp.put('C', 0);

        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            if (line.charAt(1) == '>') {
                mp.put(line.charAt(0), mp.get(line.charAt(0))+1);
            }
            else {
                mp.put(line.charAt(2), mp.get(line.charAt(2))+1);
            }
        }

        if (mp.get('A') == 1 && mp.get('B') == 1 && mp.get('C') == 1) {
            System.out.println("Impossible");
        }
        else {
            if (mp.get('A') == 0) {
                System.out.print('A');
            }
            else if(mp.get('B') == 0) {
                System.out.print('B');
            }
            else {
                System.out.print('C');
            }

            if (mp.get('A') == 1) {
                System.out.print('A');
            }
            else if(mp.get('B') == 1) {
                System.out.print('B');
            }
            else {
                System.out.print('C');
            }

            if (mp.get('A') == 2) {
                System.out.print('A');
            }
            else if(mp.get('B') == 2) {
                System.out.print('B');
            }
            else {
                System.out.print('C');
            }
        }
    }
}

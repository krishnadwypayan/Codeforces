import java.util.Scanner;

public class PetyaAndCountryside {

    private static Integer findWateredSections(int n, int[] nums) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sec = 1, j = i;
            while (j < n-1 && nums[j] >= nums[j+1]) {
                sec++;
                j++;
            }

            j = i;

            while (j > 0 && nums[j] >= nums[j-1]) {
                sec++;
                j--;
            }

            ans = Math.max(sec, ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] vals = scanner.nextLine().split(" ");

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(vals[i]);
        }

        System.out.println(findWateredSections(n, nums));
    }
}

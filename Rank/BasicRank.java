import java.util.*;

public class BasicRank {
    public static void main(String[] args) {
        int[] scores = {87, 100, 92, 100, 76};
        int[] ranks = rank(scores);

        System.out.println(Arrays.toString(ranks)); // [3, 1, 2, 1, 5]
    }

    public static int[] rank(int[] scores) {
        int n = scores.length;
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            int r = 1;
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) {
                    r++;
                }
            }
            ranks[i] = r;
        }

        return ranks;
    }
}

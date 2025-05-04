import java.util.*;

public class HashSearchExample {
    public static boolean hashSearch(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set.contains(target);
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 9, 7, 1};
        System.out.println(hashSearch(data, 9)); // 출력: true
    }
}

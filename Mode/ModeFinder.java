import java.util.*;

public class ModeFinder {
    public static int findMode(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // 등장 횟수 카운팅
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // 최빈값 찾기
        int mode = nums[0];
        int maxCount = freqMap.get(mode);

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("최빈값: " + findMode(nums)); // 출력: 3
    }
}

import java.util.*;

/*
    ✅ 문제: Sliding Window Maximum (슬라이딩 윈도우 최댓값)
    정수 배열 nums와 정수 k가 주어질 때,
    크기 k의 슬라이딩 윈도우 내에서의 최댓값들을 구하시오.

    🧪 입력 예시:
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;

    ✅ 출력 예시:
    [3, 3, 5, 5, 6, 7]
 */

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        //List<Integer> result = findMaxSlidingWindow(nums, k);
        List<Integer> result = findMaxSlidingWindowDeque(nums, k);
        System.out.println(result);
    }

    public static List<Integer> findMaxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k == 0 || nums.length < k) return result;

        for (int i = 0; i <= nums.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result.add(max);
        }

        return result;
    }

    public static List<Integer> findMaxSlidingWindowDeque(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (k == 0 || nums.length < k) return result;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        return result;
    }
}

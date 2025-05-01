import java.util.*;

/*
    ✅ 문제: Sliding Window Minimum
    주어진 배열 nums와 정수 k에 대해,
    크기 k의 슬라이딩 윈도우를 이동하며 각 구간의 최소값을 반환하시오.
 */

public class SlidingWindowMin {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        List<Integer> result = findMinSlidingWindow(nums, k);
        System.out.println(result);
    }

    public static List<Integer> findMinSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k == 0 || nums.length < k) return result;

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if(!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[i] <= nums[deque.peekLast()]) {
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

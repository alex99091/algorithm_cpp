import java.util.*;

/*
    ✅ 문제: Subarray Sum Equals K (부분 배열 합이 K인 경우의 개수)
    정수 배열 nums와 정수 k가 주어질 때,
    연속 부분 배열(subarray) 중에서 원소의 합이 정확히 k가 되는
    경우의 **개수**를 구하시오.

    🧩 힌트
    - 모든 부분 배열을 검사하면 O(n²)입니다.
    - 누적합(prefix sum)과 HashMap을 활용하면 O(n)으로 최적화할 수 있습니다.

    🧪 입력 예시 1:
    int[] nums = {1, 1, 1};
    int k = 2;

    ✅ 출력 예시 1:
    2
    // 가능한 부분 배열: [1,1] (index 0~1), [1,1] (index 1~2)

    🧪 입력 예시 2:
    int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
    int k = 7;

    ✅ 출력 예시 2:
    4
    // 가능한 부분 배열:
    // [3,4]        (0~1)
    // [7]          (2~2)
    // [3,4,7,-3,-1,-?] … (예시로만 기재, 실제 로직에서 확인)
 */

public class SubarraySumCount {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        int count = countSubarraysWithSum(nums, k);
        System.out.println(count); // 기대 결과: 2
    }

    public static int countSubarraysWithSum(int[] nums, int k) {
        if(k == 0 || nums.length < k) return 0;
        

        return 0;
    }
}

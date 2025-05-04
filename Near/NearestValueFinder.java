/*
    ✅ 문제: 배열에서 가장 가까운 수 찾기
    정렬된 정수 배열 nums와 타겟 정수 target이 주어질 때,
    배열 내에서 target에 가장 가까운 수를 반환하시오.
    단, 두 수가 같은 차이라면 더 작은 수를 반환합니다.

    예시:
    nums = [1, 3, 5, 7, 9], target = 6
    출력: 5
 */

import java.util.*;

public class NearestValueFinder {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 6;
        int result = findClosest(nums, target);
        System.out.println("가장 가까운 수: " + result); // 출력: 5
    }

    public static int findClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("배열이 비어 있습니다.");

        int left = 0, right = nums.length - 1;

        // 이진 탐색으로 타겟 위치 근처까지 좁히기
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return nums[mid];
            else if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }

        // 인덱스 범위 체크 및 가장 가까운 수 결정
        if (left == 0) return nums[0];
        if (Math.abs(nums[left] - target) < Math.abs(nums[left - 1] - target)) {
            return nums[left];
        } else {
            return nums[left - 1];
        }
    }
}

/*
✅ 문제: 목표 합을 만드는 쌍 찾기
정수 배열 nums와 정수 target이 주어졌을 때,
합이 target이 되는 두 수의 인덱스 쌍을 찾아 반환하세요.
단, 각 입력에 정답은 오직 하나 존재한다고 가정합니다.

조건:
시간 복잡도는 O(n)을 목표로 하세요.

동일한 원소를 두 번 사용할 수 없습니다. 
int[] nums = {2, 7, 11, 15};
int target = 9;
[0, 1] // nums[0] + nums[1] == 9
*/

import java.util.*;

public class SumTest {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1, -1}; // 임시 반환값
    }
}


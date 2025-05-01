import java.util.*;

/*
    ✅ 문제 1: 정수 배열의 평균 구하기 (기본)
    정수 배열 nums가 주어질 때, 배열의 평균을 반환하시오.
    단, 배열이 비어 있다면 0을 반환합니다.
 */

public class BasicAverage {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        System.out.println(average(nums));
    }

    public static int average(int[] nums) {
        if (nums.length == 0) return 0;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum / nums.length;
    }
}

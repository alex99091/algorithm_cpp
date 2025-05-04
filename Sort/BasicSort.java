import java.util.*;

/*
    ✅ 문제 2: 정수 배열 정렬하기 (기본)
    정수 배열 nums가 주어질 때, 오름차순으로 정렬된 배열을 반환하시오.
    단, 새로운 배열로 반환하지 말고, 주어진 배열을 직접 정렬합니다.
 */

public class BasicSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 2};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums)); // [1, 2, 3, 5, 8]
        selectionSort(nums);
        System.out.println(Arrays.toString(nums)); // [1, 2, 3, 5, 8]
        insertionSort(nums);
        System.out.println(Arrays.toString(nums)); // [1, 2, 3, 5, 8]
    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i; j < n; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] =temp;
        }
    }

    public static void insertionSort(int[] nums) {
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
    }
}
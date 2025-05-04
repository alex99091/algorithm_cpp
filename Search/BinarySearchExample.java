import java.util.Arrays;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9}; // 정렬된 배열
        System.out.println(binarySearch(data, 5)); // 출력: 2
    }
}

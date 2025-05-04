public class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1, 9};
        System.out.println(linearSearch(data, 8)); // 출력: 2
    }
}

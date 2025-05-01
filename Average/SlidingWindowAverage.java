import java.util.*;

public class SlidingWindowAverage {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        System.out.println(slidingAverage(nums, k));
    }

    public static ArrayList<Double> slidingAverage(int[] nums, int k) {
        ArrayList<Double> result = new ArrayList<>();
        if (k == 0 || nums.length < k) return null;

        double sum = 0;

        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        result.add(sum / k);

        for(int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            result.add(sum / k);
        }
        
        return result;
    }
}

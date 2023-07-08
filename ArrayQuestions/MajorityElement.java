import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int majority = 0;
        int maxCount = 0;

        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);

            if (count > maxCount) {
                majority = num;
                maxCount = count;
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}

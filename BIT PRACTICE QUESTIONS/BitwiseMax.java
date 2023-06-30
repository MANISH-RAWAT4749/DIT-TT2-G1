public class BitwiseMax{
public static int findMaximumBitwiseAnd(int[] nums) {
    int maxBitwiseAnd = 0;
    int n = nums.length;
    
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            int bitwiseAnd = nums[i] & nums[j];
            if (bitwiseAnd > maxBitwiseAnd) {
                maxBitwiseAnd = bitwiseAnd;
            }
        }
    }
    
    return maxBitwiseAnd;
}

public static void main(String[] args) {
    int[] nums = {3, 5, 8, 10, 12};
    int maxBitwiseAnd = findMaximumBitwiseAnd(nums);
    System.out.println("Maximum Bitwise AND value: " + maxBitwiseAnd);
}
}

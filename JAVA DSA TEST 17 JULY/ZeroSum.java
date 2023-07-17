import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSum {
    public static boolean hasZeroSumSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            if (num == 0 || prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            }

            set.add(prefixSum);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        if (hasZeroSumSubarray(nums)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

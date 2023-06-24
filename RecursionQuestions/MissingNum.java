class MissingNum {
    int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 3};
        int result = solution.missingNumber(nums);
        System.out.println(result); // Output: 2
    }
}

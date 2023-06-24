class PowerFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 16;
        boolean result = solution.isPowerOfFour(n);
        System.out.println(result); // Output: true
    }
}

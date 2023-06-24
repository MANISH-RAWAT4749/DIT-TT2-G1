class SuperPow {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        if (b.length == 0) {
            return 1;
        }
        int lastDigit = b[b.length - 1];
        int[] reducedB = new int[b.length - 1];
        System.arraycopy(b, 0, reducedB, 0, b.length - 1);

        int part1 = myPow(a, lastDigit);
        int part2 = myPow(superPow(a, reducedB), 10);

        return (part1 * part2) % MOD;
    }

    private int myPow(int a, int k) {
        a %= MOD;
        int result = 1;
        for (int i = 0; i < k; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 2;
        int[] b = {1, 0};
        int result = solution.superPow(a, b);
        System.out.println(result); // Output: 1024
    }
}

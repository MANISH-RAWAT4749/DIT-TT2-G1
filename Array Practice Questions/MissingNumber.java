public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};

        int missingNumber = findMissingNumber(arr);

        System.out.println("Second Missing Number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int missing1 = -1, missing2 = -1;

        // Mark the visited elements
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            if (absValue <= n) {
                arr[absValue - 1] = -Math.abs(arr[absValue - 1]);
            }
        }

        // Find the first missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing1 = i + 1;
                break;
            }
        }

        // Find the second missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing2 = i + 1;
                break;
            }
        }

        return missing2;
    }
}

public class ZigZagArrayConverter {
    public static void convertToZigZag(int[] arr) {
        int n = arr.length;
        boolean isLesser = true;

        for (int i = 0; i < n - 1; i++) {
            if (isLesser) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            isLesser = !isLesser;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        convertToZigZag(arr);

        // Print the zigzag array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

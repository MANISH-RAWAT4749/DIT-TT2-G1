public class AddSubTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = addAndSubtractArrays(arr1, arr2);

        System.out.println("Result Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] addAndSubtractArrays(int[] arr1, int[] arr2) {
        int n = Math.max(arr1.length, arr2.length);
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int num1 = (i < arr1.length) ? arr1[i] : 0;
            int num2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = num1 + num2;
        }

        return result;
    }
}

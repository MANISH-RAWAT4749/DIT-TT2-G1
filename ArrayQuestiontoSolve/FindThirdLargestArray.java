public class FindThirdLargestArray{
public static void main(String[] args) { 
int[] arr = { 10, 20, 5, 15 };
int thirdLargest = findThirdLargest(arr);
System.out.println("Third largest element: " + thirdLargest);
}
public static int findThirdLargest(int[] arr) {
    if (arr.length < 3) {
        throw new IllegalArgumentException("Array length should be at least 3");
    }

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > first) {
            third = second;
            second = first;
            first = arr[i];
        } else if (arr[i] > second) {
            third = second;
            second = arr[i];
        } else if (arr[i] > third) {
            third = arr[i];
        }
    }

    return third;
}
}

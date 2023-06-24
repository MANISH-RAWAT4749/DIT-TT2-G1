import java.util.Arrays;

public class NthLargestArray {  
public static int findNthLargest(int[] arr, int n) {
    if (arr.length < n) {
        throw new IllegalArgumentException("Array length should be at least n");
    }

    Arrays.sort(arr);
    return arr[arr.length - n];
}
 public static void main(String[] args) {
int[] arr = { 10, 20, 5, 15 };
int n = 2;
int nthLargest = findNthLargest(arr, n);
System.out.println(n + "th largest element: " + nthLargest);
 }
}

import java.util.Arrays;

public class HighestElement {

    public static int findHighestElement(int[] array) {
        if (array.length == 1) {
            return array[0];
        } else {
            int highestElement = findHighestElement(Arrays.copyOfRange(array, 1, array.length));
            if (array[0] > highestElement) {
                return array[0];
            } else {
                return highestElement;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int highestElement = findHighestElement(array);
        System.out.println(highestElement); // 5
    }
}

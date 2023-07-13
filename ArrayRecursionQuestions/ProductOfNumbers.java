import java.util.List;

public class ProductOfNumbers {

    public static int productOfNumbers(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 1;
        } else {
            return numbers.get(0) * productOfNumbers(numbers.subList(1, numbers.size()));
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int product = productOfNumbers(numbers);
        System.out.println(product); // 6
    }
}

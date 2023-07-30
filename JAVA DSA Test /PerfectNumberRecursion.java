import java.util.ArrayList;
import java.util.List;

public class PerfectNumberRecursion {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Perfect numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i, i - 1)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfect(int num, int divisor) {
        if (divisor == 0) {
            return false;
        }

        if (divisor == 1) {
            return num == 1;
        }

        if (num % divisor == 0) {
            return isPerfect(num, divisor - 1) || (num / divisor == divisor);
        }

        return isPerfect(num, divisor - 1);
    }
}

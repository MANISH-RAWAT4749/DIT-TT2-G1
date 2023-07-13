import java.util.Arrays;

public class AddTaxToSalary {

    public static int[] addTaxToSalary(int[] salaries, double tax) {
        int[] newSalaries = new int[salaries.length];
        for (int i = 0; i < salaries.length; i++) {
            newSalaries[i] = salaries[i] + (salaries[i] * tax);
        }
        return newSalaries;
    }

    public static void main(String[] args) {
        int[] salaries = {1000, 2000, 3000};
        double tax = 0.1;
        int[] newSalaries = addTaxToSalary(salaries, tax);
        System.out.println(Arrays.toString(newSalaries)); // [1100, 2200, 3300]
    }
}

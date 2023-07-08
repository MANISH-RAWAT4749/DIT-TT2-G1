public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            int remainingGas = gas[i] - cost[i];
            totalGas += remainingGas;
            currentGas += remainingGas;

            if (currentGas < 0) {
                startingStation = i + 1;
                currentGas = 0;
            }
        }

        return (totalGas >= 0) ? startingStation : -1;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = canCompleteCircuit(gas, cost);
        System.out.println("Gas Station: " + result);
    }
}

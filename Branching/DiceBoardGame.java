import java.util.*;

public class DiceBoardGame {
    public static void main(String[] args) {
        int[] ladder = new int[101];
        int[] snake = new int[101];

        // Initialize the ladder and snake positions
        ladder[1] = 38;
        ladder[4] = 14;
        ladder[9] = 31;
        ladder[21] = 42;
        ladder[28] = 84;
        ladder[36] = 44;
        ladder[51] = 67;
        ladder[71] = 91;
        ladder[80] = 100;

        snake[98] = 78;
        snake[95] = 75;
        snake[93] = 73;
        snake[87] = 24;
        snake[64] = 60;
        snake[62] = 19;
        snake[56] = 53;
        snake[49] = 11;
        snake[47] = 26;
        snake[16] = 6;

        int[] rolls = new int[101];
        Arrays.fill(rolls, Integer.MAX_VALUE);

        rolls[1] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == 100)
                break;

            for (int i = 1; i <= 6; i++) {
                int next = current + i;

                if (next > 100)
                    continue;

                if (ladder[next] != 0)
                    next = ladder[next];

                if (snake[next] != 0)
                    next = snake[next];

                if (rolls[next] > rolls[current] + 1) {
                    rolls[next] = rolls[current] + 1;
                    queue.offer(next);
                }
            }
        }

        System.out.println("Minimum number of rolls required: " + rolls[100]);
    }
}

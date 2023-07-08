import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KWeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        if (mat == null || mat.length == 0 || mat[0].length == 0 || k <= 0) {
            return result;
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        
        for (int i = 0; i < mat.length; i++) {
            int soldiers = countSoldiers(mat[i]);
            pq.offer(new int[]{i, soldiers});
            
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll()[0];
        }
        
        return result;
    }
    
    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        
        int k = 3;
        int[] weakestRowsResult = kWeakestRows(matrix, k);
        System.out.println("The K Weakest Rows: " + Arrays.toString(weakestRowsResult));
    }
}

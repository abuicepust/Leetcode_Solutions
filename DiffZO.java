import java.util.Arrays;

public class DiffZO {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 1},{1, 0, 1},{0, 0, 1}};
        int[][] diffMatrix = onesMinusZeros(mat);

        System.out.println(Arrays.deepToString(diffMatrix));
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] rows = new int[n];
        int[] cols = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rows[i] += (grid[i][j] == 1? 1:0);
                cols[j] += (grid[i][j] == 1? 1:0);
            }
        }
        int[][] diff = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diff[i][j] = rows[i] + cols[j] - (m-rows[i]) - (n-cols[j]);
            }
        }

        return diff;
    }
}

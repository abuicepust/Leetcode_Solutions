import java.util.ArrayList;
import java.util.List;

public class PascalsT {
    public static void main(String[] args) {
        int numRows = 5;
        
        List<List<Integer>> result = generate(numRows);
        printPascalsTriangle(result);
    }

    public static void printPascalsTriangle(List<List<Integer>> triangle) {
        // Printing the Pascal's Triangle
        for (List<Integer> row : triangle) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) return result;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);

        List<Integer> prevRow = row;

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            currentRow.add(1);
            result.add(new ArrayList<>(currentRow));
            prevRow = currentRow;
        }

        return result;
    }
}

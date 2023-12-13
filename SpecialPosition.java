public class SpecialPosition {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0}, {0, 0, 1},{1, 0, 0}};
        int SpecialPos = numSpecial(matrix);
        System.out.println(SpecialPos);
    }
    public static int numSpecial(int[][] mat) {
       int res = 0;
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j] == 1){
                if (verifyZeros(mat, i, j)) {
                    res++;
                }
            }
        }
       } 
       return res;
    }
    public static boolean verifyZeros(int[][] mat, int x,int y){
        for(int i=0;i<mat.length;i++){
            if(i != x){
                if(mat[i][y] == 1){
                    return false;
                }
            }
        }
        for(int i=0;i<mat[0].length;i++){
            if(i != y){
                if(mat[x][i] == 1){
                    return false;
                }
            }
        }

        return true;
    }
}

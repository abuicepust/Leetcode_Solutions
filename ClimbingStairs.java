public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
     
        if(n == 0 || n== 1){
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);       

    }
}

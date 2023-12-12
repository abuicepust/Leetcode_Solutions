import java.util.Arrays;

public class MaxProductA {
    public static void main(String[] args) {
        int[] numsw = {1,2,3,4,5};
        System.out.println(maxProduct(numsw));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums[nums.length-1] -1;
        int j= nums[nums.length-2] -1;
        return i * j;
    }
}

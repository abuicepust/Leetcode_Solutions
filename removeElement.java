public class removeElement {
    public static void main(String[] args) {
       int[] nums = {3,2,2,3};
       System.out.println(removeElements(nums,2)); 
    }
    public static int removeElements(int[] nums,int val) {

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j]= nums[i];
                j++;
            }
        }
        
        return j;
    }
}


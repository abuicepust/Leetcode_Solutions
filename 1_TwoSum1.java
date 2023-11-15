// class TwoSum1 {
//     public static void main(String[] args) {
//         //System.out.println("Hello World");
//         int nums[] = {1,2,5};
//         int target = 7;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if((nums[i] + nums[j]) == target){
//                     System.out.println((i+1)+" "+(j+1));
//                 }
//             }
//         }
//     }
// }

class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }
}


public class MergeArray {
    public static void main(String[] args) {
        int[] nwum1 = { 1, 2, 3};
        int[] nwum2 = { 2, 5, 6 };
        int k = 3; // Use k instead of m
        int l = 3; // Use l instead of n
        merge(nwum1, k, nwum2, l);
        for (int koll : nwum1) {
            System.out.print(koll + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
    }

}

public class Palindrom9 {
    public static void main(String[] args) {
        // Palindrom(121);
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(121));
    }
    // public static void Palindrom(int x){
    // //int x2;
    // while(x != 1){
    // int x2 = x % 10;
    // }
    // }
}

class Solution {
    public boolean isPalindrome(int xx) {
        int temp = xx;
        if (xx == 0) {
            return true;
        }
        if (xx < 0 || xx % 10 == 0) {
            return false;
        }
        int rev = 0;
        while (xx > 0) {
            int digit = xx % 10;
            rev = (rev * 10) + digit;
            xx = xx/10;
        }
        if (temp == rev){
            return true;
        }else
            return false;
    }
}

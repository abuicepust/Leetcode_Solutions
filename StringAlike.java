import java.util.Set;

public class StringAlike {
    public static void main(String[] args) {
        String str = "book";
        System.out.println(halvesAreAlike(str));        
    }
    public static boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length-1;
        Set vowels = Set.of('a','e','i','o','u', 'A', 'E', 'I','O','U');

        int lcount = 0, rcount = 0;
        while (left<right) {
            lcount += vowels.contains(ch[left] )? 1 : 0;
            rcount += vowels.contains(ch[right]) ? 1 : 0;
            left++;
            right--;
        }

        return lcount == rcount;
    }
}

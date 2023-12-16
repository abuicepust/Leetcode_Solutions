public class Anagram {
    public static void main(String[] args) {
        String s = "hello";
        String t = "olleh";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() == t.length()) {
            int[] count = new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            for(int i=0;i<t.length();i++){
                count[t.charAt(i)-'a']--;
            }
            for(int i=0;i<count.length;i++){
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

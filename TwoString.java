public class TwoString {
    public static void main(String[] args) {
        String[] word1 = {"ab","c","d"};
        String[] word2 ={"ab","c","d"};
        System.out.println(arrayStringsAreEqual(word1, word2));
       
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = makeString(word1);
        String s2 = makeString(word2);

        return s1.equals(s2);       
    }
    public static String makeString(String[] s){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length;i++){
            sb.append(s[i]);
        }
        return sb.toString();
    }

}

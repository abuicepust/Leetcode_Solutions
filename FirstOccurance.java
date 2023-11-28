public class FirstOccurance {
    public static void main(String[] args) {
        System.out.println(strStr("aaa","aaaa"));
    }
    public static int strStr(String haystack, String needle) {
        
        
        //int j=0;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                //strA.charAt(i) = haystack.charAt(i);
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }                
            } 
        }
        return -1;
    }
}

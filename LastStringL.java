public class LastStringL {
    public static void main(String[] args) {
        String s= "Hello World KamalV";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        
        String[] str = s.split(" ");
        String s2 = str[str.length-1].toString();
        

        return s2.length();
    }
}

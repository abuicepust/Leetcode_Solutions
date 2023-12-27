import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicString {
    public static void main(String[] args) {

        IsomorphicString isomorphicString = new IsomorphicString();

        String s = "foo";
        String t = "bar";

        // Calling the isIsomorphic method and print the result
        boolean result = isomorphicString.isIsomorphic(s, t);
        System.out.println("Isomorphic: " + result);

    }

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> check = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!map.containsKey(c1)) {
                if (check.add(c2)) {
                    map.put(c1, c2);
                } else
                    return false;
            } else {
                if (!map.get(c1).equals(c2)){
                    return false;}
            }
        }
        return true;
    }
}

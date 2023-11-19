import java.util.HashMap;
//import java.util.Map;



public class RomanTInt {
    public static void main(String[] args) {
        HashT obj = new HashT();
        System.out.println(obj.Solution("MCMXCIV"));
    }
}
class HashT{
    public int Solution(String s){

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//         I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        //System.out.println(map);
        int result = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            }else{
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }
}


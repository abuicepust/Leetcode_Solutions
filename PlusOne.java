import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {

        // int last = digits[digits.length-1] + 1;
        // digits[digits.length-1] = last;
        int length = digits.length;
        // for (int i = 0; i < digits.length; i++) {
        //     LastDigit = LastDigit * 10 + digits[i];
        // }

        // LastDigit = (LastDigit + 1) % 10;
        // digits[digits.length-1] = LastDigit;

        for(int i=length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
            
        int[] newNumber = new int[length+1];
        newNumber[0] =1;
        return newNumber;
    }
}

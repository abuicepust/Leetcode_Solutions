public class DivideTwoInt {
    public static void main(String[] args) {
        System.out.println(divide(7, -3));        
    }
    public static int divide(int dividend, int divisor) {
        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;
        //divisor = Math.abs(divisor);
        boolean sign = (dividend >= 0) && (divisor >= 0) ? true: false;
        divisor = Math.abs(divisor);
        dividend = Math.abs(dividend);
        int result = 0;
        while (dividend - divisor >= 0) {
            int count = 0;
            while (dividend - (divisor << 1 << count) >= 0) {
                count++;
            }
            result += 1 << count;
            dividend -= divisor << count;
        }
        return sign ? result: -result;
    }
}

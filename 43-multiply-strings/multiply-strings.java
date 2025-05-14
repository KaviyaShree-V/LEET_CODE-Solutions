import java.math.BigInteger; 
class Solution {
    public String multiply(String num1, String num2) {
        String result = null;
        BigInteger i1 = new BigInteger(num1);
        BigInteger i2 = new BigInteger(num2);
        BigInteger i3= i1.multiply(i2);
        result = String.valueOf(i3);
        return result;
    }
}
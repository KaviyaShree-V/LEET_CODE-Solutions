class Solution 
{
    public String fractionToDecimal(int numerator, int denominator) 
    {
        if (numerator == 0) 
            return "0";

        StringBuilder sb = new StringBuilder();

        boolean isNegative = (numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0);
        if (isNegative) 
            sb.append("-");

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        sb.append(num / den);
        long remainder = num % den;

        if (remainder == 0) 
            return sb.toString();

        sb.append(".");

        Map<Long, Integer> map = new HashMap<>();
        StringBuilder decimalPart = new StringBuilder();

        int index = 0;
        while (remainder != 0) 
        {
            if (map.containsKey(remainder)) 
            {
                int start = map.get(remainder);
                decimalPart.insert(start, "(");
                decimalPart.append(")");
                break;
            }

            map.put(remainder, index++);
            remainder *= 10;
            decimalPart.append(remainder / den);
            remainder %= den;
        }

        return sb.append(decimalPart).toString();
    }
}
import java.math.BigInteger;
class Solution {
    public int getLucky(String s, int k) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String add = "";
        char[] ch = s.toCharArray();

        for(int i=97; i<=123; i++)
        {
            char c = (char) i;
            map.put(c,i-96);
        }

        for(char c:ch)
        {
            if(map.containsKey(c))
            {
                int value = map.get(c);
                add += value;
            }
        }

        BigInteger nums = new BigInteger(add);

        for (int i = 0; i < k; i++) {

            int sum = 0;
            String numStr = nums.toString();
            for (char digit : numStr.toCharArray()) 
            {
                sum += digit - '0';
            }
            nums = BigInteger.valueOf(sum);
        }

        return nums.intValue();
    }
}
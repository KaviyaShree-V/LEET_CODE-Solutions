class Solution {
    public int addDigits(int num) {
        String s = String.valueOf(num);
        // int res=0;
        while(num >= 10)
        {
            int res=0;
            while(num > 0)
            {
                res += num % 10;
                num /=10;
            }
            num = res;
        }
        return num;
    }
}
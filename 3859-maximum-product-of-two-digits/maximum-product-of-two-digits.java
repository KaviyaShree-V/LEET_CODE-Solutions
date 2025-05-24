class Solution {
    public int maxProduct(int n) 
    {
        // String s = String.valueOf(n);
        int max1 = -1, max = -1;
        // for(int i=0; i<s.length(); i++)
        // {
        //     int c = s.charAt(i) - '0';
        //     if(c > max)
        //     {
        //         max1 = max;
        //         max = c;
        //     }
        //     else
        //     {
        //         max1 = Math.max(c, max1);
        //     }
        // }

        while(n>0)
        {
            int digit= n%10;
            if(digit > max)
            {
                max1 = max;
                max = digit;
            }
            else if(digit > max1)
            {
                max1 = digit;
            }
            n/=10;
        }
           
        return max * max1;
    }
}
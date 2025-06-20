class Solution 
{
    public boolean judgeSquareSum(int c) 
    {
        // int mid = c/2;
        // int m = mid*mid , m1 = (c-m)*(c-m);
        // if((m+m1)==c)
        // return true;
        // return false;
        long a = 0;
        long b = (long)Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c)
                return true;
            else if (sum < c)
                a++;
            else
                b--;
        }

        return false;
    }
}
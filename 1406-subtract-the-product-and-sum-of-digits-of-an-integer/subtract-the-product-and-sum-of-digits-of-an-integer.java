class Solution {
    public int subtractProductAndSum(int n) 
    {
        int res = 0, m=1, a=0;
        int length = String.valueOf(n).length();
        for(int i=0; i<length; i++)
        {
            m *= n%10;
            a += n%10;
            n /= 10;
        }
        res = m-a;
        return res;
    }
}
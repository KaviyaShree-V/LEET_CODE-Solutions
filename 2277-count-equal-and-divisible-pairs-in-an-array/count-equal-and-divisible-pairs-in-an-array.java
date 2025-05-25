class Solution {
    public int countPairs(int[] nums, int k) 
    {
        int result = 0;
        for(int i = 0; i<nums.length; i++)
        {
            int h = nums[i];
            for(int j = i+1; j<nums.length; j++)
            {
                if(h == nums[j])
                {
                    int mul = i*j;
                    if(mul % k == 0 && i<j)
                    {
                        result++;
                    }
                    else
                    continue;
                }
            }
        }
        return result;
    }
}
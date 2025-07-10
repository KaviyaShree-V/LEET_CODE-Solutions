class Solution {
    public int rob(int[] nums) 
    {
        // int count =0, n = nums.length;
        // if(n > 3 )
        // {
        // for(int i=0; i<n; i+=2)
        //     {
        //         count+=nums[i];
        //     }
        // }
        // else
        // {
        //     int max = Integer.MIN_VALUE;
        //     for(int i=0; i<n; i++)
        //     {
        //         max = Math.max(max, nums[i]);
        //     }
        //     count = max;
        // }
        // return count;
        int prev1 = 0, prev2 = 0;

        for (int num : nums) 
        {
            int temp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }

        return prev1;
    }
}
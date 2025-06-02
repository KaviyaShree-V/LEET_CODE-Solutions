class Solution {
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=nums.length-3; i>=0; i--)
        {
            int h = nums[i];
            int j = nums[i+1];
            int k = nums[i+2];
            if(h+j > k)
            return h+j+k;
        }
        return 0;
    }
}
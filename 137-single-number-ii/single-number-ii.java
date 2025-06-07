class Solution {
    public int singleNumber(int[] nums) 
    {
        if(nums.length == 1)
        return nums[0];
        Arrays.sort(nums);
        int result = -1;
        for(int i=0; i<nums.length; i++)
        {
            if((i==0 && nums[i] != nums[i+1]) || (i==nums.length -1 && nums[i] != nums[i-1]) || i>0 && (i+1) < nums.length && (nums[i] != nums[i-1]) && (nums[i] != nums[i+1]))
            {
                result = nums[i];
            }
        }
        return result;
    }
}
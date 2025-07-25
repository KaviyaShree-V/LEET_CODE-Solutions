class Solution {
    public int[] singleNumber(int[] nums) 
    {
        if(nums.length == 2)
        return nums;
        Arrays.sort(nums);
        int[] result = new int[2];
        int index =0;
        for(int i=0; i<nums.length; i++)
        {
            if((i==0 && nums[i] != nums[i+1]) || (i==nums.length -1 && nums[i] != nums[i-1]) || i>0 && (i+1) < nums.length && (nums[i] != nums[i-1]) && (nums[i] != nums[i+1]))
            {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }
}
class Solution {
    public int findNumbers(int[] nums) 
    {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            int length = String.valueOf(nums[i]).length();
            if(length%2 == 0)
            count++;
        }
        return count;
    }
}
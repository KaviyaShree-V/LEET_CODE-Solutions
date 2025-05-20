class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int count =0,index=0;
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                arr[index] = nums[i];
                index++;
                count++;
            }else
            {
                continue;
            }
        }
        for(int i=0; i<nums.length;i++)
        {
            if(i<arr.length)
            {
                nums[i]=arr[i];
            }
            else
            {
                nums[i]=val;
            }
        }
        return count;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int[] i1 = new int[nums.length];
        int index=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                i1[index]=nums[i];
                index++;
                count++;
            }
        }
        for(int i=count;i<nums.length;i++)
        {
            i1[index]=0;
            index++;
            count++;
        }
        for(int k=0;k<nums.length;k++)
        {
            nums[k]=i1[k];
        }
    }
}
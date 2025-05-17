class Solution {
    public void rotate(int[] nums, int k) 
    {
        int[] n = new int[nums.length];
        int index =0;
         while (k > nums.length) {
            k = k - nums.length;
        }
        for(int i=nums.length-k; i<=nums.length ;i++)
        {
            if(i==nums.length)
            {
                i=0;
            }
            if(index==nums.length)
            {
                break;
            }
            n[index]=nums[i];
            index++;
        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=n[i];
        }
    }
}
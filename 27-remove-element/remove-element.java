class Solution {
    public int removeElement(int[] nums, int val) 
    {
        // int count =0,index=0;
        // int[] arr = new int[nums.length];

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=val)
        //     {
        //         arr[index] = nums[i];
        //         index++;
        //         count++;
        //     }else
        //     {
        //         continue;
        //     }
        // }
        // for(int i=0; i<nums.length;i++)
        // {
        //     if(i<arr.length)
        //     {
        //         nums[i]=arr[i];
        //     }
        //     else
        //     {
        //         nums[i]=val;
        //     }
        // }
        // return count;

        int i=0, j=nums.length-1;
        while(i<=j)
        {
            if(nums[i]==val)
            {
                nums[i]=nums[j];
                j--;
            }else
            {
                i++;
            }
        }
        return j+1;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num=0;num<nums.length;num++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[num]==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                result = nums[num];
            }
        }
        return result;
    }
}
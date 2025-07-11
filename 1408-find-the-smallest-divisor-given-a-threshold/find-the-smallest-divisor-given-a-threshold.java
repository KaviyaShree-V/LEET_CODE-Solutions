class Solution {
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            max = Math.max(max, nums[i]);
        }
       
        int low = 1 , high = max, ans = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int count = calCeil(nums, mid);
            if(count <= threshold)
            {
                ans = mid;
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    public int calCeil(int[] nums, int mid)
    {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            count += Math.ceil((double) nums[i]/(double)mid);
        }
        return count;
    }
}
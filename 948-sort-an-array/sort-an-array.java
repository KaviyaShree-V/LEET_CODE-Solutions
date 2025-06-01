class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        int low = 0, high = nums.length - 1;
        return check(nums, low, high);
    }

    public int[] check(int[] nums, int low, int high)
    {
        if(low >= high)
        return nums;

        int mid = (low + high)/2;
        check(nums, low, mid);
        check(nums, mid+1, high);
        return merge(nums, low, mid, high);
    }

    public int[] merge(int[] nums, int low, int mid, int high)
    {
        int[] result = new int[high - low + 1];
        int left = low, right = mid+1, index = 0;
        while(left <= mid && right <= high) 
        {
            if (nums[left] <= nums[right])
            {
                result[index] = nums[left];
                left++;
                index++;
            }
            else
            {
                result[index] = nums[right];
                right++;
                index++;
            }
        }
        while(left <= mid )
            {
                result[index] = nums[left];
                left++;
                index++;
            }
        while(right <= high)
            {
                result[index] = nums[right];
                right++;
                index++;
            }
        for(int i = 0; i < result.length; i++) 
        {
            nums[low + i] = result[i];
        }
        return result;
    }
}
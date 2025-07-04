class Solution {
    public int search(int[] nums, int target) {
        int searchElement =-1;
        int low = 0, high = nums.length - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[low] > nums[mid])
            {
                if(nums[mid] <= target && target <= nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            else
            {
                if(nums[low] <= target && target <= nums[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
        }
        return searchElement;
    }
}
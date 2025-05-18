class Solution {
    public int search(int[] nums, int target) {
        int searchElement =-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                searchElement = i;
                break;
            }
        }
        return searchElement;
    }
}
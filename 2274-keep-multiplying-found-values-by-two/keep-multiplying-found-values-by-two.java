class Solution {
    public int findFinalValue(int[] nums, int original) 
    {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            hash.add(nums[i]);
        }
        while(hash.contains(original))
        {
            original = original * 2;
        }
        return original;
    }
}
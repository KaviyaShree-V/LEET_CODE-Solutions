class Solution {
    public int findDuplicate(int[] nums) 
    {
        int low = 0, high = nums.length-1;
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            check.put(nums[i],check.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : check.entrySet())
        {
            if(entry.getValue()>1)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}
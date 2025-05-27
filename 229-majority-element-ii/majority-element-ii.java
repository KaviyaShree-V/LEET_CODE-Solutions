class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> check = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length/3;
        for(int i=0; i<nums.length; i++)
        {
            if(check.containsKey(nums[i]))
            {
                check.put(nums[i],check.get(nums[i])+1);
            }
            else
            {
                check.put(nums[i],1);
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(check.get(nums[i]) > n)
            {
                if(!(result.contains(nums[i])))
                result.add(nums[i]);
            }
        }
        return result;
    }
}
class Solution {
    public int findMaxLength(int[] nums) 
    {
        int result = 0, count0 = 0, count1 = 0;
        HashMap<Integer, Integer> check = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count0++;
            }
            else
            {
                count1++;
            }
            int dif = count1 - count0;
            if(check.containsKey(dif))
            {
                result = Math.max(result, i - check.get(dif));
            }
            else if(count0 == count1)
            {
                 result = Math.max(result, i+1);
            }
            else
            {
                check.put(dif , i);
            }
        } 
        return result;   
    }
}
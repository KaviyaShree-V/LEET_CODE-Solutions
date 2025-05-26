class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer> add = new HashSet<>();
        for(int i=0; i<n; i++)
        {
            add.add(nums[i]);
        }

        for(int i=1; i<=nums.length; i++)
        {
            if(!(add.contains(i)))
            {
                result.add(i);
            }
        }
        return result;
    }
}
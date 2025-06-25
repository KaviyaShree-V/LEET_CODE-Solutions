class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] add = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) 
        {
            list.add(num);
        }
        list.sort((m,n) ->
        {
            int x = map.get(m);
            int y = map.get(n);
            if(x!=y)
            return x-y;
            else
            return n-m;
        });
        for(int i=0; i<list.size(); i++)
        {
            add[i] = list.get(i);
        }
        return add;
    }
}
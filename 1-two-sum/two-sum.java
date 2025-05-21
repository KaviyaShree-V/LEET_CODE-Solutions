class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        // int[] sub = new int[2];
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //     if(nums[i]+nums[j]==target)
        //     {
        //         sub[0]=i;
        //         sub[1]=j;
        //     }
        //     }
        // }
        // // System.out.println(Arrays.toString(sub));
        // return sub;

        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int x = target-nums[i];
            if(hash.containsKey(x))
            {
                return new int[] { hash.get(x) ,i};   
            }
            else
            {
                hash.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
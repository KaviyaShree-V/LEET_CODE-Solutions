class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0, sum = 0, bal;
        HashMap<Integer, Integer> add = new HashMap<>();
        add.put(0,1);
        // for(int i=0;i<nums.length;i++)
        // {
        //     int sum = 0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         sum+=nums[j];
        //         if(sum==k)
        //         {
        //             count++;
        //         }
        //     }
        // }

        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            bal = sum - k;

            if(add.containsKey(bal))
            {
                count+= add.get(bal);
            }

            if(add.containsKey(sum))
            {
                add.put(sum, add.get(sum)+1);
            }
            else
            {
                add.put(sum, 1);
            }
        }
        return count;
    }
}

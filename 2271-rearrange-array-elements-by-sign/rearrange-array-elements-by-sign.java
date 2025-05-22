class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        int[] n = new int[nums.length];
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > 0)
            {
                positive.add(nums[i]);
            }
            else
            {
                negative.add(nums[i]);
            }
        }

        if(positive.size() > negative.size())
        {
            for(int i=0; i<negative.size(); i++)
            {
                n[2*i]= positive.get(i);
                n[2*i+1]= negative.get(i);
            }
            int index = 2*negative.size();
            for(int i = negative.size(); i<positive.size(); i++)
            {
               n[index]= positive.get(i);
                index++;
            }
        }
        else
        {
            for(int i=0; i<positive.size(); i++)
            {
                n[2*i]= positive.get(i);
                n[2*i+1]= negative.get(i);
            }
            int index = 2*positive.size();
            for(int i = positive.size(); i<negative.size(); i++)
            {
                n[index]= negative.get(i);
                index++;
            }
        }
        return n;
    }
}
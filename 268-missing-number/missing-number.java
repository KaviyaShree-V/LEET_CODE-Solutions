class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> checkNum = new ArrayList<>();
        int notFound = 0;
        for(int i=0;i<nums.length;i++)
        {
            checkNum.add(nums[i]);
        }
        for(int i=0;i<=checkNum.size();i++)
        {
            if(checkNum.contains(i))
            {
                continue;
            }
            else
            {
                notFound = i;
                break;
            }
        }
        return notFound;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            int mul = nums[i]*nums[i];
            result[i] = mul;
        }
        Arrays.sort(result);
        return result;
    }
}
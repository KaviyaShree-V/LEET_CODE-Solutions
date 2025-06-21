class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) 
        {
            int j = i + 1;
            int k = n - 1;

            while (j < k) 
            {
                int product = nums[i] * nums[j] * nums[k];
                if (product > maxProduct) 
                {
                    maxProduct = product;
                }
                j++;
                k--;
            }
        }

        return maxProduct;
    }
}
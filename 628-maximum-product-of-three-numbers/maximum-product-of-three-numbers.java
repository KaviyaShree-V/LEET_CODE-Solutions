class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        // int maxProduct = Integer.MIN_VALUE;

        // for (int i = 0; i < n - 2; i++) 
        // {
        //     int j = i + 1;
        //     int k = n - 1;

        //     while (j < k) 
        //     {
        //         int product = nums[i] * nums[j] * nums[k];
        //         if (product > maxProduct) 
        //         {
        //             maxProduct = product;
        //         }
        //         j++;
        //         k--;
        //     }
        // }

        // return maxProduct;

        int num1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int num2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(num1, num2);
    }
}
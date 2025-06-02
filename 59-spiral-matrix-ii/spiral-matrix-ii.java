class Solution {
    public int[][] generateMatrix(int n) 
    {
        int[][] nums = new int[n][n];
        int left = 0, right = n-1, top = 0, bottom = n-1, num = 1;
        while(top<=bottom && left<=right)
        {
            for(int i=left; i<=right; i++)
            {
                nums[top][i] = num++;
            }
            top++;
            for(int i=top; i<=bottom; i++)
            {
                nums[i][right] = num++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    nums[bottom][i] = num++;
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    nums[i][left] = num++;
                }
                left++;
            }
        }
        return nums;
    }
}
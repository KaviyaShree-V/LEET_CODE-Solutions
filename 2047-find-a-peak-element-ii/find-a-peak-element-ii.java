class Solution 
{
    public int[] findPeakGrid(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;

        int left = 0, right = n - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;

            int maxRow = 0;
            for (int i = 1; i < m; i++) 
            {
                if (mat[i][midCol] > mat[maxRow][midCol]) 
                {
                    maxRow = i;
                }
            }

            boolean leftS = midCol == 0 || mat[maxRow][midCol] > mat[maxRow][midCol - 1];
            boolean rightS = midCol == n - 1 || mat[maxRow][midCol] > mat[maxRow][midCol + 1];

            if (leftS && rightS) 
            {
                return new int[]{maxRow, midCol};
            } else if (!leftS) 
            {
                right = midCol - 1;
            } else 
            {
                left = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
class Solution {
    public void rotate(int[][] matrix) 
    {
        // int size = matrix.length;
        // int[][] n = new int[size][size];
        // for(int i=0; i<size; i++)
        // {
        //     for(int j=0; j<size; j++)
        //     {
        //         n[i][j] = matrix[i][j];
        //     }
        // }
        // for(int i=0; i<size; i++)
        // {
        //     for(int j=0; j<size; j++)
        //     {
        //         matrix[j][size-1-i] = n[i][j];
        //     }
        // }

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i; j<matrix[0].length; j++)
            {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<(matrix.length)/2; j++)
            {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
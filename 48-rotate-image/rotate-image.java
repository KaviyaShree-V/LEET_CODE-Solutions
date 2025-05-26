class Solution {
    public void rotate(int[][] matrix) 
    {
        int size = matrix.length;
        int[][] n = new int[size][size];
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                n[i][j] = matrix[i][j];
            }
        }
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                matrix[j][size-1-i] = n[i][j];
            }
        }
    }
}
class Solution {
    public int[][] merge(int[][] intervals) 
    {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>()
        {
            public int compare(int[] a , int[] b)
            {
                return a[0] - b[0];
            }
        }
        );
        int[][] result = new int[n][2];
        int index = 0;
        for(int i=0; i<n ;i++)
        {
            if(index == 0 || intervals[i][0] > result[index - 1][1])
            {
                result[index][0] = intervals[i][0];
                result[index][1] = intervals[i][1];
                index++;
            }
            else
            {
                result[index - 1][1] = Math.max(result[index - 1][1], intervals[i][1]);
            }
        }
        return Arrays.copyOf(result,index);
    }
}
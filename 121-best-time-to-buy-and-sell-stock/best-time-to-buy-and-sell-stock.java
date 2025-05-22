class Solution {
    public int maxProfit(int[] arr) 
    {
     int max = 0, min = Integer.MAX_VALUE;
     for(int i=0; i<arr.length; i++)
     {
        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]-min);
     } 
     return max;
    }
}
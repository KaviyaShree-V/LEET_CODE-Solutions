class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<bloomDay.length; i++)
        {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        long val = (long) m*k;
        if(bloomDay.length < val)
        return -1;
        int low = min, high = max, ans = high;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(check(bloomDay, mid, m, k) == true)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean check(int[] bloomDay, int mid, int m, int k)
    {
        int count = 0, bouquets = 0;
        for(int i=0; i<bloomDay.length; i++)
        {
            if(bloomDay[i] <= mid)
            {
                count++;
            }
            else
            {
                bouquets += (count/k);
                count = 0;
            }
        }
        bouquets += (count/k);
        return bouquets>=m;
    }
}
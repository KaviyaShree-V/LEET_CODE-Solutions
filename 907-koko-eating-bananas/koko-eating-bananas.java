class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low = 1, high = findMax(piles), ans = 0;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            long total_hours = calHours(piles, mid);
            if(total_hours <= (long)h)
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

    public int findMax(int[] piles)
    {
        int high = 0;
        for(int i=0; i<piles.length; i++)
        {
            high = Math.max(high , piles[i]);
        }
        return high;
    }

    public long calHours(int[] piles, int hours)
    {
        long thours = 0;
        for(int pile : piles)
        {
            // thours += Math.ceil((double)piles[i]/(double)hours);
            thours += (pile + hours - 1) / hours; 
        }
        return thours;
    }
}
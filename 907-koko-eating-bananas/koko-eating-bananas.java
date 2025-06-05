class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low = 1, high = findMax(piles), ans = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int total_hours = calHours(piles, mid);
            if(total_hours <= h)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
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

    public int calHours(int[] piles, int hours)
    {
        int thours = 0;
        for(int i=0; i<piles.length; i++)
        {
            thours += Math.ceil((double)piles[i]/(double)hours);
        }
        return thours;
    }
}
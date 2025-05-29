class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) 
    {
        int len = n + m;
        int gap = (len / 2) + ( len % 2);
        while(gap > 0)
        {
            int left = 0;
            int right = left + gap;
            while ( right < len )
            {
                if(left < n && right >= n)
                {
                    swap(nums1, nums2, left , right - n);
                }
                else if( left >= n)
                {
                    swap(nums2, nums2, left - n , right - n);
                }
                else
                {
                    swap(nums1, nums1, left , right);
                }
                left++;
                right++;
            }

            if (gap == 1) 
            break;
            else
            gap = (gap / 2) + (gap % 2);
        }

        for (int i = 0; i < m; i++)
        {
            nums1[n + i] = nums2[i];
        }
    }

    public void swap(int a[], int b[], int x, int y)
    {
        if(x < a.length && y < b.length && a[x] > b[y])
            {
                int temp = b[y];
                b[y] = a[x];
                a[x] = temp;
            }
    }
}
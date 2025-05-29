class Solution {
    public int reversePairs(int[] nums) 
    {
        int n = nums.length-1;
        return divide(nums , 0, n);
    }

    int divide(int[] nums, int low, int high)
    {
        int count = 0;
        if(low>=high)
        {
            return count;
        }
        int mid = (low + high) / 2;
        count += divide(nums, low, mid);
        count += divide(nums, mid+1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) 
        {
            while (right <= high && (long)arr[i] > 2L * arr[right]) 
            {
            right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    int merge(int[] nums, int low, int mid, int high)
    {
        int left = low , right = mid + 1;
        int count = 0;
        ArrayList<Integer> add = new ArrayList<>();

        while(left <= mid && right <= high )
            {
                if(nums[left] <= nums[right])
                {
                    add.add(nums[left]);
                    left++;
                }
                else
                {
                    add.add(nums[right]);
                    count += (mid - left + 1);
                    right++;
                }
            }

        while(left <= mid)
        {
            add.add(nums[left]);
            left++;
        }
        while(right <= high)
        {
            add.add(nums[right]);
            right++;
        }

        for(int i=low; i<=high; i++)
        {
            nums[i] = add.get(i - low);
        }

        return count;
    }
}
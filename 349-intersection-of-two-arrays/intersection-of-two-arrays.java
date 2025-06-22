class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int length = Math.max(nums1.length, nums2.length);
        int[] temp = new int[length];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) 
        {
            for (int j = 0; j < nums2.length; j++) 
            {
                if (nums1[i] == nums2[j]) 
                {
                    boolean b = false;
                    for (int k = 0; k < index; k++) 
                    {
                        if (temp[k] == nums1[i]) 
                        {
                            b = true;
                            break;
                        }
                    }
                    if (!b) 
                    {
                        temp[index] = nums1[i];
                        index++;
                    }
                    break;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) 
        {
            result[i] = temp[i];
        }

        return result;
    }
}
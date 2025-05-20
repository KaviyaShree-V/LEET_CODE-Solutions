class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int n = nums.length, count = 0, sum = 0;
        hashmap.put(0, 1); 
        for (int i = 0; i < n; i++) 
        {
            sum += nums[i];

            int remain = sum - k;

            if (hashmap.containsKey(remain)) 
            {
                count += hashmap.get(remain); 
            }

            if (hashmap.containsKey(sum)) 
            {
                hashmap.put(sum, hashmap.get(sum) + 1);
            } else 
            {
                hashmap.put(sum, 1);
            }
        }
        return count;
    }
}

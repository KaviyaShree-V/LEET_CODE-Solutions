class Solution {
    public int longestConsecutive(int[] nums) {
        int send = 0;
        Set<Integer> check = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            check.add(nums[i]);
        }
        for(int i: check)
        {
            if (!check.contains(i - 1)) 
                {
                int cnt = 1;
                int x = i;
                while (check.contains(x + 1)) 
                {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                send = Math.max(send, cnt);
            }
        }
        return send;
    }
}
class Solution {
    public int firstUniqChar(String s) 
    {
        // Map<Character,Integer> check = new HashMap<>();
        int n = s.length();
        int[] check = new int[256];
        for(int i=0; i<n; i++)
        {
            char c = s.charAt(i);
            // if(check.containsKey(c))
            // {
            //     check.put(c,check.get(c)+1);
            // }
            // else
            // {
            //     check.put(c,1);
            // }
            // check.put(c, check.getOrDefault(c, 0) + 1);
            check[c]++;
        }
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(check[c] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}
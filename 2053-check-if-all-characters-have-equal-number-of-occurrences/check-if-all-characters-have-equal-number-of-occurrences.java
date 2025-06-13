class Solution {
    public boolean areOccurrencesEqual(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) 
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int value = 0;
        for(int i : map.values())
        {
            if(value == 0)
            {
                value = i;
            }
            else if(value != i)
            {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            ArrayList<Character> list = new ArrayList<>();
            for(int j=i; j<s.length(); j++)
            {
                char ch = s.charAt(j);
                if(list.contains(ch))
                {
                    break;
                }
                list.add(ch);
            }
             count = Math.max(count,list.size());
        }
        return count;
    }
}
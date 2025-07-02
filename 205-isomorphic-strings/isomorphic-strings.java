class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        if (s.length() != t.length()) return false;

        int[] s1 = new int[256];
        int[] t1 = new int[256];

        for (int i = 0; i < s.length(); i++) 
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (s1[ch1] != t1[ch2]) 
            {
                return false;
            }
            s1[ch1] = i + 1;
            t1[ch2] = i + 1;
        }

        return true;
    }
}
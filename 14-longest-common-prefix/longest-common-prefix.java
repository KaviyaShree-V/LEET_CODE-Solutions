class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        int min = Integer.MAX_VALUE ,ch=0;
        String s="", result ="";
        boolean b = true;
        for(int i=0; i<strs.length; i++)
        {
            int size = strs[i].length();
            if(size < min)
            {
                min = size;
                s = strs[i];
            }
        }

        for(int i=0; i<min; i++)
        {
            char c = s.charAt(i);
            for(int j = 0; j < strs.length; j++) 
            {
                if(strs[j].charAt(i) != c) 
                {
                    return result;
                }
            }
            result +=c;
        }
            
        return result;
    }
}
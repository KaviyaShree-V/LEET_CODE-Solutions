class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        int first = word1.length();
        int second = word2.length();
        String as = "";
        int max = Math.min(first, second);

        for(int i=0; i<max; i++)
        {
            char[] c = word1.toCharArray();
            char[] ch = word2.toCharArray();
            as += c[i];
            as += ch[i];
        }
        if(first > max)
        as += word1.substring(max, first);
        else
        as += word2.substring(max, second);
        return as;
    }
}
class Solution {
    public String reverseWords(String s) 
    {
        String[] str = s.strip().split("\\s+");
        for(int i=0; i<str.length; i++)
        {
            char[] ch = str[i].toCharArray();
            int k = ch.length-1;
            for(int j=0; j<k; j++)
            {
                char temp = ch[k];
                ch[k] = ch[j];
                ch[j] = temp;
                k--;
            }
            str[i] = new String(ch);
        }
        return String.join(" ",str);
    }
}
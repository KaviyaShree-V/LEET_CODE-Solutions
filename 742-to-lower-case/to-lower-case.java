class Solution {
    public String toLowerCase(String s) 
    {
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            int ascii = ch[i];
            if (ascii >= 65 && ascii <= 90) 
            {
                ch[i] = (char) (ascii + 32);
            }
        }
        return String.valueOf(ch);
    }
}
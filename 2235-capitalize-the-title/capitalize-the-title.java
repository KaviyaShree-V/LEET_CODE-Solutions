class Solution {
    public String capitalizeTitle(String title) 
    {
        String[] s = title.strip().split("\\s+");
        for(int i=0; i<s.length; i++)
        {
            char[] ch = s[i].toCharArray();
            if(ch.length == 1 || ch.length == 2)
            {
                for(int j=0; j<ch.length; j++)
                {
                    int ascii = ch[j];
                    if (ascii >= 65 && ascii <= 90) 
                    {
                        ch[j] = (char) (ascii + 32);
                    }
                }
                s[i] = new String(ch);
            }
            else
            {
                for(int j=1; j<ch.length; j++)
                {
                    int ascii = ch[j];
                    int first = ch[0];
                    if (first >= 97 && first <= 123) 
                    {
                        ch[0] = (char) (first - 32);
                    }
                    if (ascii >= 65 && ascii <= 90) 
                    {
                        ch[j] = (char) (ascii + 32);
                    }
                }
                s[i] = new String(ch);
            }
        }
        return String.join(" ", s);
    }
}
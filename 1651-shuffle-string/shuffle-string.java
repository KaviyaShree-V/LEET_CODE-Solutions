class Solution {
    public String restoreString(String s, int[] indices) 
    {
        char[] c = s.toCharArray();
        char[] ch = new char[c.length];
        for(int i=0; i<c.length; i++)
        {
            int index = indices[i];
            ch[index] = c[i];
        }
        s = String.valueOf(ch);
        return s;
    }
}
class Solution {
    public void reverseString(char[] s) 
    {
        int j = 0;
        for(int i=0; i<s.length/2; i++)
        {
            j = s.length - 1 -i;
            char ch = s[j];
            s[j] = s[i];
            s[i] = ch;
        }
    }
}
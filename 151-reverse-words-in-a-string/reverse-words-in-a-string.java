class Solution {
    public String reverseWords(String s) 
    {
        String[] c = s.strip().split("\\s+");

        int i = 0;
        int j = c.length-1;
        while(i<=j)
        {
            String temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", c);
    }
}
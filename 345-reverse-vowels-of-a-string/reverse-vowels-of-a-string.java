class Solution {
    public String reverseVowels(String s) 
    {
        ArrayList<Character> arrayList = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] c = s.toCharArray();
        int h1 = 0, h2 = s.length()-1;
        for(int i=0;i<c.length;i++)
        {
            while(!(arrayList.contains(c[h1])) && h1<h2)
            {
                h1++;
            }
            while(!arrayList.contains(c[h2]) && h1<h2)
            {
                h2--;
            }
            if(h1<h2)
            {
                char temp = c[h1];
                c[h1] = c[h2];
                c[h2] = temp;
                h1++;
                h2--;
            }
        }
        s=String.valueOf(c);
        return s;
    }
}
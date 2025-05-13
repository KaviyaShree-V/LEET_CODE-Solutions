class Solution {
    public boolean isPalindrome(String s) 
    {
     StringBuilder sb = new StringBuilder();
     for(int i=0;i<s.length();i++)
     {
        char ch = s.charAt(i);
        if(Character.isLetterOrDigit(ch))
        {
            // g.append(Character.toLowerCase(ch));
             sb.append(Character.toLowerCase(ch));
        }
     }
      if (sb.length() == 0) 
      {
        return true;
      }
     for(int i=0;i<=sb.length()/2;i++)
     {
        int end = sb.length()-1-i;
        char ch = s.charAt(i);
        if (sb.charAt(i) != sb.charAt(end)) 
        {
            return false;
        }
     }
     return true;
    }
}
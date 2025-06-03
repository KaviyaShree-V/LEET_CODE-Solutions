class Solution {
    public boolean rotateString(String s, String goal) 
    {
        String ss = s+s;

        if(s.length() == goal.length())
        {
            if(ss.contains(goal))
            {
                return true;
            }
        }
        return false;    
    }
}
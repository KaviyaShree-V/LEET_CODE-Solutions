class Solution 
{
    public int maximumGain(String s, int x, int y) 
    {
        StringBuilder sb = new StringBuilder(s);
        int score = 0;
        if(x > y)
        {
            score += points(sb, x, "ab");
            score += points(sb, y, "ba");
        }
        else
        {
            score += points(sb, y, "ba");
            score += points(sb,x,"ab");
        }
        return score;
    }

    public int points(StringBuilder sb, int var, String pattern)
    {
        StringBuilder stack = new StringBuilder();
        int score = 0, n = sb.length();
        if(n<2)
            return 0;
        for(int i=0; i<sb.length(); i++)
        {
            int length = stack.length();

            if(length > 0 && stack.charAt(length - 1) == pattern.charAt(0) && sb.charAt(i) == pattern.charAt(1))
            {
                stack.deleteCharAt(length - 1);
                score += var;
            }
            else
            {
                stack.append(sb.charAt(i));
            }
        }
        sb.setLength(0);
        sb.append(stack);
        return score;
    }
}
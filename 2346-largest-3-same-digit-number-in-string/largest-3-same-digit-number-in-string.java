class Solution {
    public String largestGoodInteger(String num) 
    {
        int index = -1;

        for (int i = 0; i <= num.length() - 3; i++) 
        {
            boolean b = true;
            String s1 = num.substring(i, i + 3);
            char c = s1.charAt(0);

            for (int j = 0; j < s1.length(); j++) 
            {
                if (s1.charAt(j) != c) 
                {
                    b = false;
                    break;
                }
            }

            if (b) 
            {
                if (!s1.equals("000"))
                    index = Math.max(index, Integer.parseInt(s1));
                else
                if(index < 0)
                    index = 0;
            }
        }

        if (index == -1)
            return "";
        if (index == 0)
            return "000";
        return String.valueOf(index);
    }
}
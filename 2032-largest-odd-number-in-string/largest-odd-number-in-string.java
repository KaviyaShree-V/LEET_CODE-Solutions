class Solution 
{
    public String largestOddNumber(String num) 
    {
        int index = -1;
        index = Math.max(num.lastIndexOf('1'),index);
        index = Math.max(num.lastIndexOf('3'),index);
        index = Math.max(num.lastIndexOf('5'),index);
        index = Math.max(num.lastIndexOf('7'),index);
        index = Math.max(num.lastIndexOf('9'),index);
        return num.substring(0,index+1);
    }
}

/*
for(int i=num.length() -1; i>=0; i--)
    {
        char c = num.charAt(i);
        if((c - '0')%2 == 1)
        return num.substring(0, i+1);
    }
    return "";
*/
/*      int n = Integer.parseInt(num);
        String s ="";
        if(n%2 != 0)
        {
            return num;
        }
        if(n%10 == 0 && n%100 != 0)
        {
            return num.substring(0, num.length() - 1);
        }
        for(int i=0; i<num.length(); i++)
            {
                int div = n%10;
                if(div%2 != 0)
                {
                    s += div;
                }
                n/=10;
            }
        return s;
*/
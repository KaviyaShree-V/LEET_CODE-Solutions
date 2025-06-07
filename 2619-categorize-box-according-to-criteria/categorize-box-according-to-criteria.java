class Solution {
    public String categorizeBox(int length, int width, int height, int mass) 
    {
        long volume = 1L *length * width * height;
        int dimen = 10000, m = 1000000000;
        String s ="";
        if((length >= dimen || width >= dimen || height >= dimen || volume >= m) && (mass >= 100))
        {
            s = "Both";
        }
        else if(length >= dimen || width >= dimen || height >= dimen || volume >= m)
        {
            s = "Bulky";
        }
        else if(mass >= 100)
        {
            s = "Heavy";
        }
        else
        {
            s = "Neither";
        }
        return s;
    }
}
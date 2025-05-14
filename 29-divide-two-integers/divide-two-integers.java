class Solution {
    public int divide(int dividend, int divisor) {
        int result=0;
        if(dividend<0 && dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }else {
        result = dividend/divisor;
        }
        return result;
    }
}
class Solution {
    public int reverse(int x) {
        int sol =0,d=0;
        int h1 = Integer.MAX_VALUE / 10, h2 = Integer.MIN_VALUE / 10;
        while(x!=0){
            d = x%10;
            x=x/10;
            if(sol > h1 ||(sol == h1 && d>7)){
                return 0;
            }else if(sol < h2 || (sol == h2 & d < -8)){
                return 0;
            }
            sol=sol*10 + d;

        }
        return sol;
    }
}
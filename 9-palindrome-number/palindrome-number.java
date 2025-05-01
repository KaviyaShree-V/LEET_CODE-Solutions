class Solution {
    public boolean isPalindrome(int x) {
       String s= String.valueOf(x);
    //    char[] p = s.toCharArray();
        int sum=0,h=x;
        if(x<0)
        return false;
        for(int i=0;i<s.length();i++){
            int n= h%10;
            sum=sum*10 + n;
            h=h/10;
        }
        System.out.println("Sum "+sum +" X "+x);
        return sum==x;
    }
}
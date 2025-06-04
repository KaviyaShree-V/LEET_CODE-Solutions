class Solution {
    public boolean detectCapitalUse(String word) 
    {
        if(word.length()==1)
        return true;
        String s1 = word.toUpperCase();
        String s2 = word.toLowerCase();
        String s3 = Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length()).toLowerCase();
        if(word.equals(s1))
        return true;
        else if(word.equals(s2))
        return true;
        else if(word.equals(s3))
        return true;
        return false;
    }
}
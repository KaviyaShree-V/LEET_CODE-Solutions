class Solution {
    public boolean detectCapitalUse(String word) 
    {
        if(word.length()==1)
        return true;
        String s1 = word.toUpperCase();
        String s2 = word.toLowerCase();
        char c = word.charAt(0);
        char capital = Character.toUpperCase(c);
        String s3 = Character.toString(capital) + word.substring(1, word.length()).toLowerCase();
        if(word.equals(s1) || word.equals(s2) || word.equals(s3))
        return true;
        return false;
    }
}
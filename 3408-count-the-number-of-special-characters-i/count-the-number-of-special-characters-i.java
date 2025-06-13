class Solution {
    public int numberOfSpecialChars(String word) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<word.length(); i++)
        {
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
        {
            char key = entry.getKey();
            char ascii = (char)(key+32);
            char ascii2 = (char)(key-32);
            if(map.containsKey(key) && (map.containsKey(ascii)||map.containsKey(ascii2)))
            count++;
        }
        return count/2;
    }
}
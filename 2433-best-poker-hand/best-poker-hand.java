class Solution {
    public String bestHand(int[] ranks, char[] suits) 
    {
        HashMap<Integer,Integer> rank = new HashMap<>();
        HashMap<Character, Integer> suit = new HashMap<>();
        int count = 0;
        String s = "";
        int max = 0;
        for(int i:ranks)
        {
            rank.put(i, rank.getOrDefault(i, 0) + 1);
        }

        for(char i:suits)
        {
            suit.put(i, suit.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : suit.entrySet()) 
        {
            if (entry.getValue() == 5) 
            {
                count = 5;
            }
        }
        
        for(int i:rank.values())
        {
            max = Math.max(max,i);
        }
        for(int i:rank.values())
        {
            if(count == 5)
            {
                s = "Flush";
            }
            else 
            {
                if(max >=3)
            {
                s = "Three of a Kind";
            }
            else if( max == 2)
            {
                s = "Pair";
            }
            else
            {
                s = "High Card";
            }
            }
        }
        return s;
    }
}
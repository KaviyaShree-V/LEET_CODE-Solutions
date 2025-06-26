class Solution 
{
    public String frequencySort(String s) 
    {
        HashMap<Character, Integer> check = new HashMap<>();
        String str = "";
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) 
        {
            check.put(s.charAt(i), check.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Character key : check.keySet()) 
        {
            list.add(check.get(key));
        }

        Collections.sort(list, (a, b) -> b - a);

        for (int i = 0; i < list.size(); i++) 
        {
            int val = list.get(i);
            Character ch = getKey(check, val);
            check.remove(ch);//same freq occurs then it print it again so we need to remove the printed char
            for (int j = 0; j < val; j++) 
            {
                str += ch;
            }
        }

        return str;
    }

    public static Character getKey(Map<Character, Integer> check, int value) 
    {
        for (Map.Entry<Character, Integer> map : check.entrySet()) 
        {
            if (map.getValue().equals(value))
                return map.getKey();
        }
        return null;
    }
}
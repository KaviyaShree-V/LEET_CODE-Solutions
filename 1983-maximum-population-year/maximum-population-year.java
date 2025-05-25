class Solution {
    public int maximumPopulation(int[][] logs) 
    {
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();

        int result = 0;
        int maxPopulation = 0;

        for (int i = 0; i < logs.length; i++) 
        {
            a.add(logs[i][0]);
            a.add(logs[i][1]);
        }

        for (int i = 0; i < a.size(); i += 2) 
        {
            int birth = a.get(i);
            int death = a.get(i + 1);
            for (int year = birth; year < death; year++) 
            {
                if (hash.containsKey(year)) 
                {
                    hash.put(year, hash.get(year) + 1);
                    } 
                    else 
                    {
                        hash.put(year, 1);
                    }
            }
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) 
        {
            int year = entry.getKey();
            int population = entry.getValue();

            if (population > maxPopulation || (population == maxPopulation && year < result)) 
            {
                maxPopulation = population;
                result = year;
            }
        }
        return result;
    }
}

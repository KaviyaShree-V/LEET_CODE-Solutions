class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1; i<=numRows; i++)
        {
            result.add(row(i));
        }
        return result;
    }

    List<Integer> row (int rows)
    {
        long sum =1;
        List<Integer> sublist = new ArrayList<>();
        sublist.add(1);
        for(int i = 1; i<rows; i++)
        {
            sum = sum * (rows - i);
            sum = sum / i;
            sublist.add((int)sum);
        }
        return sublist;
    }
}
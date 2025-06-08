class Solution {
        public boolean isHappy(int num) 
        {
        Set<Integer> seen = new HashSet<>();
        
        while (num != 1 && !seen.contains(num)) 
        {
            seen.add(num);
            int res = 0;
            while (num > 0) 
            {
                int digit = num % 10;
                res += digit * digit;
                num /= 10;
            }
            num = res;
        }
        
        return num == 1;
    }
}
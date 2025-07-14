class Solution {
    public int countPrimes(int n) {
    //         if (n <= 2) 
    //         return 0;
    //         int send = 0;
    //         for (int i = 2; i < n; i++) 
    //         {
    //             int j = 2;
    //             while (j * j <= i) 
    //             {
    //                 if (i % j == 0) 
    //                 {
    //                     break;
    //                 }
    //                     j++;
    //             }
    //                     if (j * j > i) 
    //                     {
    //                         send++;
    //                     }
    //         }
    // return send;

     if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) 
        {
            if (isPrime[i]) 
            {
                for (int j = i * i; j < n; j += i) 
                {
                    isPrime[j] = false; 
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) 
        {
            if (prime) 
                count++;
        }

        return count;
    }
}
class Solution { 
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int count_sum_odd = 0;
        int count_sum_even = 1;
        int prefixSum = 0;
        int resp = 0;

        for(int n : arr){
            prefixSum += n;
            
            if(prefixSum % 2 == 1){
                count_sum_odd++;
                resp = (resp + count_sum_even) % MOD;
            }else{
                count_sum_even++;
                resp = (resp + count_sum_odd) % MOD;
            }
        }
        return resp;
    }
}

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum = 0;
        int maiorPrefix = 0;
        int menorPrefix = 0;
        int resp = 0; //maior diferença entre algum prefix
        for(int i = 0 ; i < nums.length; i++){
            prefixSum += nums[i];
            if(prefixSum > maiorPrefix){
                maiorPrefix = prefixSum;
            }else
            if(prefixSum < menorPrefix){
                menorPrefix = prefixSum;
            }
            int aux1 = Math.abs(prefixSum - maiorPrefix);
            int aux2 = Math.abs(prefixSum - menorPrefix);
            
            if( aux1 > resp) resp = aux1;
            else
            if(aux2 > resp) resp = aux2; 
        }
        return resp;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int[] check = new int[2];
        int controle, i;
        controle = i = 0;
        while(i < nums.length){
            if(i < 1){
                nums[controle] = nums[i];
                check[0] = nums[i];
                check[1]++;
                controle++;
            }else 
            if(nums[i] != check[0]){
                check[1] = 0;
                nums[controle] = nums[i];
                check[0] = nums[i];
                check[1]++;
                controle++;
            }else
            if(check[1] == 1){
                nums[controle] = nums[i];
                check[1]++;
                controle++;
            }
            i++;
        }
        return controle;
    }
}

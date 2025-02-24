import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        float m = n/2f;
        int i=1;
        Arrays.sort(nums);
        int count = 1;
        int resp = nums[0];
        while( i < n){
            if(nums[i] != nums[i-1]){
                count = 1;
            }else{
                count++;
            }

           if(count > m){
                resp  = nums[i];
                break;
           }
            i++;
        }   
        return resp;
    }
}

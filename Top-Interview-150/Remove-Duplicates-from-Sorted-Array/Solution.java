class Solution {
    public int removeDuplicates(int[] nums) {
        int controle = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[controle] = nums[i];
                controle++;
            }
        }
        return controle;
    }
}

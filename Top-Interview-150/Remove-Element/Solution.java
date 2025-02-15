class Solution {
    public int removeElement(int[] nums, int val) {
        int posIsolar = nums.length - 1;
        int posPercorrer = nums.length - 1;
        int aux;
        int resp[];

        while (posPercorrer >= 0) {
            if (nums[posPercorrer] == val) {
                aux = nums[posIsolar];
                nums[posIsolar] = nums[posPercorrer];
                nums[posPercorrer] = aux;
                posIsolar--;
            }
            posPercorrer--;

        }
        int k = posIsolar + 1;
        resp = new int[k];
        for (int i = 0; i > k; i++) {
            resp[i] = nums[i];
        }
        nums = resp;
        return k;
    }
}   

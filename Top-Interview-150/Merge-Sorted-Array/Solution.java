class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m - 1;
        int pos2 = n - 1;
        int posInserir = m + n - 1;
        while (posInserir >= 0) {
            if (pos1 > -1 && pos2 > -1) {
                if (nums1[pos1] > nums2[pos2]) {
                    nums1[posInserir] = nums1[pos1];
                    pos1--;
                    posInserir--;
                } else {
                    nums1[posInserir] = nums2[pos2];
                    pos2--;
                    posInserir--;
                }
            } else if (pos1 < 0) {
                nums1[posInserir] = nums2[pos2];
                pos2--;
                posInserir--;
            } else {
                nums1[posInserir] = nums1[pos1];
                pos1--;
                posInserir--;
            }
        }
    }
}

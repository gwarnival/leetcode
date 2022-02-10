class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length;
        for (int i = m; i < length; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}

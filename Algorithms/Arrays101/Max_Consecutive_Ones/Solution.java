class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int longger = 0;
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            length++;
            if (nums[i] == 1) {
                if (longger < length) {
                    longger = length;
                }
            } else {
                length = 0;
            }
        }
        return longger;
    }
}
class Solution {
    public int findNumbers(int[] nums) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isEven = false;
            int num = nums[i];
            while (num >= 10) {
                num /= 10;
                if (isEven) {
                    isEven = false;
                } else {
                    isEven = true;
                }
            }
            if (isEven) {
                output += 1;
            }
        }
        return output;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int square = num * num;
            nums[i] = square;
        }
        Arrays.sort(nums);
        return nums;
    }
}
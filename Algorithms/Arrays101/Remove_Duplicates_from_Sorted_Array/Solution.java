class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 0;
        int pointer = 1;
        while (pointer < nums.length) {
            if (nums[index] == nums[pointer]) {
                pointer++;
            } else {
                nums[++index] = nums[pointer];
            }
        }

        return index + 1;
    }
}
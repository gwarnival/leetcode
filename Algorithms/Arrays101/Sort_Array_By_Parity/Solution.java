class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int writePointer = 0;
        int readPointer = nums.length - 1;

        while (writePointer < readPointer) {
            if (nums[readPointer] % 2 == 0) {
                int swap = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = swap;
                writePointer++;
            } else {
                readPointer--;
            }
        }
        return nums;
    }
}
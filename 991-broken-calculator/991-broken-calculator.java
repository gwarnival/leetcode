class Solution {
    public int brokenCalc(int startValue, int target) {
        int result = 0;
        while (target > startValue) {
            if (target % 2 > 0) {
                target++;
            } else {
                target /= 2;
            }
            result++;
        }
        result = result + startValue - target;
        return result;
    }
}
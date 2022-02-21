class Solution {
    public int heightChecker(int[] heights) {

        int[] expected = heights.clone();
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    int swap = heights[i];
                    heights[i] = heights[j];
                    heights[j] = swap;
                }
            }
        }
        int result = 0;
        for (int k = 0; k < expected.length; k++) {
            if (expected[k] != heights[k]) {
                result++;
            }
        }
        return result;
    }
}
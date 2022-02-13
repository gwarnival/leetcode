class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        if (maxIndex == 0 || maxIndex == arr.length - 1) {
            return false;
        }
        for (int j = 0; j < maxIndex; j++) {
            if (arr[j] >= arr[j + 1]) {
                return false;
            }
        }
        for (int k = maxIndex; k < arr.length - 1; k++) {
            if (arr[k] <= arr[k + 1]) {
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        Map<Integer, Integer> hmap = new HashMap<>();
        // [7,1,14,11]
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (hmap.containsKey(current)) {
                return true;
            }

            if (arr[i] % 2 == 0) {
                hmap.put(current / 2, current);
            }
            hmap.put(current * 2, current);
        }
        return false;
    }
}
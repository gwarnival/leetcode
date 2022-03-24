class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int result = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            if (limit >= people[left] + people[right]) {
                left++;
            }
            right--;
            result++;
        }
        return result;
    }
}
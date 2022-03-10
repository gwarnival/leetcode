class Solution {
    public boolean isPalindrome(int x) {        
        
        
        if (x < 0) {
            return false;
        }
        int origin = x;
        int palindrome = 0;
        while (x > 0) {
            int reminder = x % 10;
            x /= 10;
            palindrome *= 10;
            palindrome += reminder;
        }
        
        return palindrome == origin;
    }
}
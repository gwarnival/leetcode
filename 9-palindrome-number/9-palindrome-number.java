class Solution {
    public boolean isPalindrome(int x) {        
        
        int origin = x;
        int palindrome = 0;
        while (x > 0) {
            int reminder = x % 10;
            x /= 10;
            palindrome = palindrome * 10 + reminder;
        }
        
        return palindrome == origin;
    }
}
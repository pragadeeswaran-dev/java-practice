class Solution {
    public boolean isPalindrome(int x) {
        int duplicate = x, reverse = 0;
        while (duplicate > 0) {
            reverse = (reverse * 10) + (duplicate % 10);
            duplicate /= 10;
        }
        return x == reverse;
    }
}

class Solution {
    public int countKeyChanges(String s) {
        int count = 0, length = s.length();
        for (int i = 0; i < length - 1; i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i + 1))) {
                count++;
            }
        }
        return count;
    }
}

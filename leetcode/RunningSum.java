class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0, j = 0;
        int[] out = new int[nums.length];
        for (int i : nums) {
            sum = sum + i;
            out[j] = sum;
            j++;
        }
        return out;
    }
}

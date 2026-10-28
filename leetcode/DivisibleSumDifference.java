class Solution {
    public int differenceOfSums(int n, int m) {
        int i = 1, num1 = 1, num2 = 1;
        while (n > 0) {
            if (i % m != 0) {
                num1 += i;
            } else {
                num2 += i;
            }
            i++;
            n--;
        }
        return num1 - num2;
    }
}

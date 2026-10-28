class Solution {
    public int sumOfMultiples(int n) {
        return sum(n, 3) + sum(n, 5) + sum(n, 7) - sum(n, 15) - sum(n, 21) - sum(n, 35) + sum(n, 105);
    }
    
    private int sum(int n, int d) {
        int k = n / d;
        return d * k * (k + 1) / 2;
    }
}

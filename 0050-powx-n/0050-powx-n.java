class Solution {
    public double myPow(double x, int n) {
        long power = n; // Use long to handle Integer.MIN_VALUE case
        if (power < 0) {
            x = 1 / x;        // Invert the base
            power = -power;   // Make power positive
        }
        
        double ans = 1.0;
        while (power > 0) {
            if (power % 2 == 1) {
                ans *= x;
            }
            x *= x;
            power /= 2;
        }
        return ans;
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // Just add one and return
                digits[i]++;
                return digits;
            }
            // If digit is 9, set to 0 and carry over
            digits[i] = 0;
        }
        
        // If all digits were 9, e.g., [9,9,9]
        int[] result = new int[n + 1];
        result[0] = 1; // rest will default to 0
        return result;
    }
}

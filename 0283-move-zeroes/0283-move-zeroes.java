class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0; // position to place next non-zero element
        
        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero] = nums[i];
                lastNonZero++;
            }
        }
        
        // Step 2: Fill the remaining positions with zeros
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

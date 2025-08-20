class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;  // pointer for placement
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i]; // place valid element at position j
                j++;
            }
        }
        return j; // j = number of elements not equal to val
    }
}

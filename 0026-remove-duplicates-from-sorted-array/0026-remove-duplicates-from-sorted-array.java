class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int r = 0; // pointer for the position of last unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[r]) { // found a new unique element
                r++;
                nums[r] = nums[i]; // place it at the next position
            }
        }
        return r + 1; // length of unique elements
    }
}

import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0]; // start of the current range

        for (int i = 1; i <= nums.length; i++) {
            // If we reached the end OR found a break in sequence
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    // Single element range
                    result.add(String.valueOf(start));
                } else {
                    // Range of more than one element
                    result.add(start + "->" + nums[i - 1]);
                }

                // Start a new range if not at the end
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
}

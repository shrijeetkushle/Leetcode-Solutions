import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: Traverse through sorted intervals
        for (int[] interval : intervals) {
            // If result is empty or no overlap
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // Overlap case → merge
                result.get(result.size() - 1)[1] = 
                    Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        // Step 3: Convert list to array
        return result.toArray(new int[result.size()][]);
    }
}

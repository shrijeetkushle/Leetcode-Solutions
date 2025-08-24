import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            // Case 1: interval ends before newInterval starts → no overlap
            if (interval[1] < newInterval[0]) {
                result.add(interval);
            }
            // Case 2: interval starts after newInterval ends → no overlap
            else if (interval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = interval; // update newInterval to keep track of remaining ones
            }
            // Case 3: overlapping intervals → merge
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // Add the last newInterval
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}

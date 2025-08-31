import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char t : tasks) {
            count[t - 'A']++;
        }
        
        // Find max frequency
        int maxFreq = 0;
        for (int c : count) {
            maxFreq = Math.max(maxFreq, c);
        }
        
        // Count how many tasks have this max frequency
        int countMax = 0;
        for (int c : count) {
            if (c == maxFreq) {
                countMax++;
            }
        }
        
        // Apply formula
        int partCount = (maxFreq - 1) * (n + 1) + countMax;
        
        // Final result
        return Math.max(tasks.length, partCount);
    }
}

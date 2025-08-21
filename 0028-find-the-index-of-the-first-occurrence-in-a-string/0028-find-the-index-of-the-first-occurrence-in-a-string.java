class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // if needle is longer than haystack → impossible
        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            // take substring of length m starting at i
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // found first match
            }
        }
        return -1; // not found
    }
}

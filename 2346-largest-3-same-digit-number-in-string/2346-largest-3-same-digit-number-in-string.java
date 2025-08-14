class Solution {
    public String largestGoodInteger(String num) {
        String maxGood = "";
        
        for (int i = 0; i <= num.length() - 3; i++) {
            char c = num.charAt(i);
            // Check if the next two characters are the same as c
            if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                String current = num.substring(i, i + 3);
                // Update if current is lexicographically greater
                if (maxGood.isEmpty() || current.compareTo(maxGood) > 0) {
                    maxGood = current;
                }
            }
        }
        
        return maxGood;
    }
}

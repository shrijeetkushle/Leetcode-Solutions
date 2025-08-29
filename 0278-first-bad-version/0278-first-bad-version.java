/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2; // avoid overflow
            
            if (isBadVersion(mid)) {
                // If mid is bad, the first bad version is at mid or before
                right = mid;
            } else {
                // If mid is good, the first bad version must be after mid
                left = mid + 1;
            }
        }
        
        return left; // or right, both point to the first bad version
    }
}

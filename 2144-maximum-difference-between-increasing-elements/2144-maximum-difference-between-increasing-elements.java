class Solution {
    public int maximumDifference(int[] nums) {
        int m=-1;
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    m=Math.max(m, nums[j]-nums[i]);
                }
            }
        }
        return m;
    }
}
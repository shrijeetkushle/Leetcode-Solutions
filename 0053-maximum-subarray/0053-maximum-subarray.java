class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=nums[0];
        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            ms=Integer.max(cs,ms);
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
}
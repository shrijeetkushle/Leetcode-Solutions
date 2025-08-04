class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int m=0;
        for(int n:candies){
            m=Math.max(n,m);
        }
        for(int i:candies){
            if(extraCandies+i>=m)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}
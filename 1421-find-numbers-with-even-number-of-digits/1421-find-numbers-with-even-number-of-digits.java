class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
       for(int i:nums){
            int con=0;
           while(i>0){
                con++;
                i=i/10;
            }
            if(con%2==0){
                count++;
            }
        }
        return count;
    }
}
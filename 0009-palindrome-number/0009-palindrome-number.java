class Solution {
    public static int pal(int n){
        int sum=0;
        while(n>0){
            int l=n%10;
           sum=(10*sum)+l;
            n=n/10;
        }
        return sum;
    }
    public boolean isPalindrome(int x) {
        if(pal(x)==x){
            return true;
        }
        return false;
    }
}
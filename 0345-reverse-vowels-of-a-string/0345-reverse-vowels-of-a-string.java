class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        char[] ans=s.toCharArray();
        int i=0, r=ans.length-1;
        while(i<r){
            while(i<r && vowels.indexOf(ans[i])==-1)i++;
            while(i<r && vowels.indexOf(ans[r])==-1)r--;
            char temp=ans[i];
            ans[i]=ans[r];
            ans[r]=temp;
            i++;
            r--;
        }
        return new String(ans);
    }
}
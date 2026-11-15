class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[123];
        for(char ch:s.toCharArray()){
            count[ch]++;
        }
        int res=0;
        for(int i=0;i<123;i++)
        {
            int val= count[i];
            res=res+(val/2)*2;
            if(res%2==0 && val%2==1)
            res++;
        } 
        return res;
    }
}
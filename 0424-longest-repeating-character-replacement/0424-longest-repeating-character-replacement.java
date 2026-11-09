class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int lft=0;
        int maxl=0;
        int maxf=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(i)-'A']);
            int size=i-lft+1;
            if(size-maxf>k){
                freq[s.charAt(lft)-'A']--;
                lft++;
            }
            maxl=Math.max(maxl,i-lft+1);
        }
        return maxl;
    }
}
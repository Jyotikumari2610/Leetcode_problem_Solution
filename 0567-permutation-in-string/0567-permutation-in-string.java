class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                break;
            }
            if(i==25){
                return true;
            }
        }
        for(int i=s1.length();i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-s1.length())-'a']--;
            boolean match=true;
            for(int j=0;j<26;j++){
               if(freq1[j]!=freq2[j]){
                match=false;
                break;
            } 
        }
        if(match){
            return true;
        }
        }
        return false;
    }
}
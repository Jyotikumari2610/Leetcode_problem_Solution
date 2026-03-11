//Given a string s, find the length of the longest substring without duplicate characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            boolean visited[]=new boolean[256];
            int length=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(visited[ch]==true){
                break;
            }
            visited[ch]=true;
            length++;
            maxLength=Math.max(maxLength,length);       
        }
        }
        return maxLength;
    }
}

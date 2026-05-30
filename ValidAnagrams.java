//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:Input: s = "anagram", t = "nagaram"
Output: true
Example 2:Input: s = "rat", t = "car"
Output: false


  class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase(); 
        if(s.length()!=t.length()){
            return false;
        }
        char A1[]=s.toCharArray();
        char A2[]=t.toCharArray();
        Arrays.sort(A1);
        Arrays.sort(A2);
        return Arrays.equals(A1,A2); 
    }
}

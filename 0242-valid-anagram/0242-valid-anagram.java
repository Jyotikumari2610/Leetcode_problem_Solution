class Solution {
    public boolean isAnagram(String s, String t) {
     /*  //the time complexity of the approach is n log n bcoz of sorting 
        s=s.toLowerCase();
        t=t.toLowerCase(); 
        if(s.length()!=t.length()){
            return false;
        }
        char A1[]=s.toCharArray();
        char A2[]=t.toCharArray();
        Arrays.sort(A1);
        Arrays.sort(A2);
        return Arrays.equals(A1,A2); */
        if(s.length()!=t.length()){
            return false;
        }
        int cnt[]=new int[26];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
            cnt[t.charAt(i)-'a']--;
        }
        for(int val:cnt){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
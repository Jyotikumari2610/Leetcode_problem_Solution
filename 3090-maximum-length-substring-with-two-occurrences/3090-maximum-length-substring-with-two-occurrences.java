class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int maxlength=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch)>2){
                char lftChar=s.charAt(left);
                map.put(lftChar,map.get(lftChar)-1);
                left++;
            }
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;
    }
}
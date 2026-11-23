class Solution {
    public int myAtoi(String s) {
        int i=0;
        int sign=1;
        long num=0;
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i<s.length()&&s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<s.length()&&s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            int dig=s.charAt(i)-'0';
            if(sign==1 && num>(Integer.MAX_VALUE-dig)/10){
                return Integer.MAX_VALUE;
            }
            if(sign==-1 && num>(-(long)Integer.MIN_VALUE-dig)/10){
                return Integer.MIN_VALUE;
            }
            num=num*10+dig;
            i++;
        }
        int ans=(int)(num*sign);
        return ans;
    }
}
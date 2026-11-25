class Solution {
    public String addStrings(String num1, String num2) {
        int n=num1.length()-1;
        int m=num2.length()-1;
        StringBuilder ans=new StringBuilder();
        int carry=0;
        while(n>=0||m>=0||carry>0){
            int sum=carry;
            if(n>=0){
                sum+=num1.charAt(n)-'0';
                n--;
            }
            if(m>=0){
                sum+=num2.charAt(m)-'0';
                m--;
            }
            ans.append(sum%10);
            carry=sum/10;
        }
        return ans.reverse().toString();
    }
}
class Solution {
    public int minInsertions(String s) {
        int fst=0;
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                fst++;
            }else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                 }else{
                    count++;
                }

                if(fst>0){
                    fst--;
                }else{
                    count++;
                }
            }
        }
        return count+fst*2;
    }

}
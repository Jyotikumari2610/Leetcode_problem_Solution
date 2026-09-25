class Solution {
    public List<String>generateParenthesis(int n){
        List<String> result=new ArrayList<>();
        generate("",2*n,result);
        return result;
    }
    private void generate(String str,int length,List<String>result){
        if(str.length()==length) {
            if(isValid(str)){
                result.add(str);
            }
            return;
        }
        generate(str+"(",length,result);
        generate(str +")",length,result);
    }
    private boolean isValid(String str) {
        int balance=0;
        for(char ch:str.toCharArray()){
            if(ch == '('){
                balance++;
            }else{
                balance--;
            }
            if(balance<0){
                return false;
            }
        }
        return balance==0;
    }
}
    
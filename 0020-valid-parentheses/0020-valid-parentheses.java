import java.util.*;
class Solution {
    public boolean isValid(String s) {
      /* if(s=="()" || s=="{}" || s=="[]"){
            return true;
        }
        else{
            return false;
        }*/
       /*if (s.equals("()") || s.equals("{}") || s.equals("[]")|| s.equals("()[]{}")) {
            return true;
        } else {
            return false;
        }*/
        while (s.contains("()")||s.contains("{}")||s.contains("[]")) {
            s =s.replace("()","");
            s =s.replace("{}","");
            s =s.replace("[]","");
        }
        return s.isEmpty();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        obj.isValid(s);
    }
}
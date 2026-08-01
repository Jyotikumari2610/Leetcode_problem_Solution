class Solution {
    public String reverseWords(String s) {
    //String[] str=s.split(" ");
    String[] str = s.trim().split("\\s+");  ///is used  because of extra spaces handling.
    int left=0;
    int right=str.length-1;
    while(left<=right){
        String temp=str[left];
        str[left]=str[right];
        str[right]=temp;
        left++;
        right--;
    }
    return String.join(" ", str);
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
    /*  String prefix=strs[0];
      for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        } 
      return prefix;
      */
     /* String prefix="";
      for(int i=0;i<strs[0].length();i++){
        char ch=strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
            return prefix;
            }
         }
         prefix+=ch;
     }
    return prefix;*/
    Arrays.sort(strs);
    String fst=strs[0];
    String lst=strs[strs.length-1];
    int minLngth=Math.min(fst.length(),lst.length());
    int i=0;
    while(i<minLngth && fst.charAt(i)==lst.charAt(i)){
        i++;
    }
    return fst.substring(0,i);
  }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String strs[]=new String[n];
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }
        Solution obj=new Solution();
        obj.longestCommonPrefix(strs);
    }
}
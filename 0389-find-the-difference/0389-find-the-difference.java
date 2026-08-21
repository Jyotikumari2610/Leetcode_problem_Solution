class Solution {
    public char findTheDifference(String s, String t) {
        //convert both string into chararray
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        //sort both the array
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return b[i];
            }
        }

        return b[b.length-1];

        //but time complexity will be O(n log n) due to sorting the array
        

    }
}
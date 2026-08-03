class Solution {
    public int[] findPeakGrid(int[][] mat) {
      int rows=mat.length;
      int cols=mat[0].length;
      int left=0;
      int right=cols-1;
      while(left<=right){
        int mid=left+(right-left)/2;
        int maxrow=0;
        for(int i=1;i<rows;i++){
            if(mat[i][mid]>mat[maxrow][mid]){
                maxrow=i;
            }
        }
        int leftval=(mid==0)?-1:mat[maxrow][mid-1];
        int rightval=(mid==cols-1)?-1:mat[maxrow][mid+1];
        if(mat[maxrow][mid]>leftval && mat[maxrow][mid]>rightval){
            return new int[]{maxrow,mid};
        }
        if(rightval>mat[maxrow][mid]){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
      }
      return new int[]{-1,-1}; 
    }
}
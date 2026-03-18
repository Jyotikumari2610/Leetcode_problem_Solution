//You are given a 0-indexed integer matrix grid and an integer k.
//Return the number of submatrices that contain the top-left element of the grid, and have a sum less than or equal to k.

 class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int prefix[][]=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                prefix[i][j]=grid[i][j];
                if(i>0)
                    prefix[i][j]+=prefix[i-1][j];
                if(j>0)
                    prefix[i][j]+=prefix[i][j-1];
                if(i>0 && j>0)
                    prefix[i][j]-=prefix[i-1][j-1];
                
                if(prefix[i][j]<=k){
                    count++;
                }
            }
        }
        return count;
    }
}

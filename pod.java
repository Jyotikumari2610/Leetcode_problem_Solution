//Input: grid = [[1,4],[2,3]] Output: true
Explanation: A horizontal cut between row 0 and row 1 results in two non-empty sections, each with a sum of 5. Thus, the answer is true.
Input: grid = [[1,3],[2,4]] Output: false


  class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
               total+=grid[i][j];
            }
        }
        if (total % 2 != 0) {
            return false;
        }
        long target = total / 2;

        long rowSum=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[i].length;j++){
               rowSum+=grid[i][j];
            }
        if(rowSum==total-rowSum){
        return true;
        }
        }
        long colSum=0;
        for(int j=0;j<grid[0].length-1;j++){
            for(int i=0;i<grid.length;i++){
               colSum+=grid[i][j];
            }
        if(colSum==total-colSum){
        return true;
        }
    }
    return false;
    }
}

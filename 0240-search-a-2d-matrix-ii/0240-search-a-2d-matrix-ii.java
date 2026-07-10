class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    /*    int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m*n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;*/
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
           if(matrix[row][col]==target){
                return true;
            } 
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
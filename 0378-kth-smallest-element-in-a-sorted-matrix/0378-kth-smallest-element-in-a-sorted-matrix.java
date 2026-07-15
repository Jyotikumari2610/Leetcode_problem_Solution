class Solution {
    public int kthSmallest(int[][] matrix,int k) {
        int n=matrix.length;
        int start=matrix[0][0];
        int end=matrix[n - 1][n - 1];

        while(start<end){
            int mid=start+(end-start)/2;
            int count=countLessEqual(matrix,mid);
            if(count<k)
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }
    private int countLessEqual(int[][] matrix,int target){
        int n=matrix.length;
        int row=n-1;
        int col=0;
        int count=0;
        while(row>= 0 && col<n){
            if(matrix[row][col]<=target){
                count+=row+1;
                col++;
            }else{
                row--;
            }
        }
        return count;  
    }
}
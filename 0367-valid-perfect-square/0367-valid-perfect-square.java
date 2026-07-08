class Solution {
    public boolean isPerfectSquare(int num) {
        //we don't have to use any bilt in functions like sqrt so the best approach for this question is by using binary search
        long start=1;
        long end=num;
        while(start<=end){
            long mid=start+(end-start)/2;
            long square=mid*mid;
            if(square == num){
                return true;
            }
            else if(square<num){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
     return false;
    }
}
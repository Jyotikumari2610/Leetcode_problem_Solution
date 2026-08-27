class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int width=right-left;//the distance between the two vertical lines is their width
            int h=Math.min(height[left],height[right]);//Left aur right line ki height mein se jo chhoti hai, usko h mein store karnah
            int area=width*h;//Container ki width ko uski height(h) se multiply karke area calculate karna h
            max=Math.max(max,area);//Compare the current area with the previous maximum area and keep whichever is larger
            if(height[left]<height[right]){//Check which of the two lines is shorter
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
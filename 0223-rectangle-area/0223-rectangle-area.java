class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //calculate  area of both the rectangle
        long areaA = (long)(ax2-ax1)*(ay2-ay1);
        long areaB = (long)(bx2-bx1)*(by2-by1);
        //coordinates of rectangle
        int overlapLeft = Math.max(ax1,bx1);
        int overlapRight = Math.min(ax2,bx2);
        int overlapBottom = Math.max(ay1,by1);
        int overlapTop = Math.min(ay2,by2);
        long overlap =0;
        if(overlapLeft<overlapRight && overlapBottom< overlapTop){
            overlap = (long)(overlapRight-overlapLeft)*(overlapTop-overlapBottom);
        }
    return (int)(areaA+areaB-overlap);
    }
}
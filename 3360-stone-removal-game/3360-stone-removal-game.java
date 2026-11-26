class Solution {
    public boolean canAliceWin(int n) {
        int remove=10;
        boolean aturn=true;
        while(n>=remove){
            n=n-remove;
            remove--;
            aturn=!aturn;
        }
        return !aturn;
    }
}
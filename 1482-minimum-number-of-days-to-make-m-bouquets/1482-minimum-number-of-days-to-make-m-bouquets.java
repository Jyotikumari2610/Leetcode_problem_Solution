class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        //hmlog start aur end ka value 0 and lengthof array-1 isliye nhi liye h kunki hmlog days p binary search lga rahe h array k indices p nhi
        int start=Integer.MAX_VALUE;   
        int end=Integer.MIN_VALUE;
        for(int day:bloomDay){
            start=Math.min(start,day);   //minimum bloom day
            end=Math.max(end,day);        //maximum bloom day
        }
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(canPossible(bloomDay,m,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public boolean canPossible(int[] bloomDay,int m,int k, int day){
        int bouqets=0;
        int flowers=0;
        for(int bloom:bloomDay){
            if(bloom<=day){   //flower bloom ho chuka hai 
                flowers++;
                if(flowers==k){//agar flower k value equal h 
                bouqets++;      //to hmlog bouqet bnayege 
                flowers=0;      //hmlog ek flower jo use kr chuke h usko dobara use nhi krenge isliye flowers=0 kr denge
                }
            }
            else{               //Matlab flower abhi bloom nahi hua
                    flowers=0;
            }
        }
        return bouqets>=m;
    }
}
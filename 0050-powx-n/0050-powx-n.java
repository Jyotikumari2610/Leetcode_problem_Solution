class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){    //  agr n ka value -(minus m h tab)
            x=1/x;
            N=-N;
        }
    return power(x,n);
    }
    public double power(double x,long n){
        if(n==0) return 1;
        double half=power(x,n/2);
        //if n is even 2^4=(2^2)^2
        if(n%2==0){
            return half*half;
        }
        //if n is odd 2^5=2*2^4     OR 2*(2^2)^2 
        return x*half*half;
        
    }
}
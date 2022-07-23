class Solution {
    public int mySqrt(int x) {
        long lo = 0;
        long hi = x;

        while(hi>=lo){     
            long mid = lo+(hi-lo)/2;
            if(x<mid*mid)
                hi = mid-1;      // not hi = mid
            else
                lo = mid+1;    
        }
        return (int)hi;
    }
}
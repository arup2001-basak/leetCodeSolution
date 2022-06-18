// Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = hight.length-1;
        int max = 0;
        while(l<r){
          int lh = hight[l];
          int rh = hight[r];
          int min_h = Math.min(lh,rh);
          int max = Math.max(max, min_h*(r-1));
          if(lf<rh)
            l++;
           else
            r--;
          }
          return max;
    }
}

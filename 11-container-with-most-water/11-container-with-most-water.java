class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int ld = height[l];
            int rd = height[r];
            int min = Math.min(ld,rd);
            max = Math.max(max,min*(r-l));
            if(ld<rd){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
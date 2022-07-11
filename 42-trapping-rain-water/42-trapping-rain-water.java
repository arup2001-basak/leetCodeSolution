class Solution {
    public int trap(int[] height) {
        int result = 0;
        if(height == null || height.length <= 2){
            return result;
        }
        
        int n = height.length ;
        int left[] = new int[n];
        int right[] = new int[n];
        
        //scan from left side
        int max = height[0];
        left[0] = height[0];
        for(int i = 1; i<n; i++){
            if(height[i]<max){
                left[i] = max;
            }
            else{
                left[i]=height[i];
                max = height[i];
            }
        }
        
        //scan from left side
        max = height[n-1];
        right[n-1]= height[n-1];
        for(int i = n-2; i>=0; i--){
            if(height[i] < max){
                right[i] = max;
            }
            else{
                right[i]=height[i];
                max = height[i];
            }
        }
        
        for(int i=0; i<height.length; i++){
        result+= Math.min(left[i],right[i])-height[i];
    }
 
        return result;
    }
}
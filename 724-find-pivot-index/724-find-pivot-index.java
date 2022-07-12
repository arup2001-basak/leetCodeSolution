class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
        } 
        int leftside = 0;
        for(int i=0; i<n ; i++){
            if(leftside == sum - leftside - nums[i]){
                return i;
            }
            leftside += nums[i];
        }
        return -1;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0]= findIndexStart(nums,target);
        result[1]= findIndexEnd(nums,target);
        return result;
    }
    public int findIndexStart(int[] nums,int target){
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int midpoint = low + (high - low) /2;
            if(nums[midpoint]>=target){
                high = midpoint - 1;
            }
            else{
                low = midpoint + 1;
            }
            if(nums[midpoint] == target){
                index = midpoint;
            }
        }
        return index;
    }
    
    public int findIndexEnd(int[] nums,int target){
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high){
            int midpoint = low + (high - low) /2;
            if(nums[midpoint]<=target){
                low = midpoint + 1;
            }
            else{
                high = midpoint - 1;
            }
            if(nums[midpoint] == target){
                index = midpoint;
            }
        }
        return index;
    }
}
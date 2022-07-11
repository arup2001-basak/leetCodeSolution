class Solution {
    public int firstMissingPositive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        
        for(int i=0 ; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        int first = 1;
        int res = -1;
        while(true){
            if(!set.contains(first)){
                res = first;
                break;
            }
            first ++;
        }
        return res;
    }
}
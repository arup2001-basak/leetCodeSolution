class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap();
        
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i = 0; i<nums.length; i++){
            int n = nums[i];
            int rem = target - n;
            if(map.containsKey(rem) && map.get(rem) != i){
                int index = map.get(rem);
                return new int[]{i, index};
            }
        }
        return new int[]{};
    }
}
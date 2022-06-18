// two sum problem finds terget

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i = 0; i<nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem) && map.get(rem) != i){
                int index = map.get(rem);
                    return new int[] {i,index};
            }
        }
        return null;
    }
}

// time O(n)
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

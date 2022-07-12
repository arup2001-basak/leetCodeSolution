class Solution {
    public boolean makesquare(int[] nums) {
        int sum = 0;
        for(final int num : nums){
            sum += num;
        }
        if(sum%4 != 0){
            return false;
        }
        
        Arrays.sort(nums);
        return numsSqu(nums.length-1, nums, new int[4],sum/4);
    }
    private boolean numsSqu(int i, int[] nums, int[] side, int sidelength){
        if(sidelength == 0){
            return false;
        }
        
        if(i<0){
            return true;
        }
        
        for (int j = 0; j < side.length; j++) {
            if (nums[i] + side[j] <= sidelength) {
                side[j] += nums[i];
                if (numsSqu(i - 1, nums, side, sidelength)) {
                    return true;
                }
                side[j] -= nums[i];
            }
        }

        return false;
    }
}
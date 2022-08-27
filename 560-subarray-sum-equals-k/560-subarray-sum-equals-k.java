class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, sum = 0;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        count.put(0, 1);
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            if (count.containsKey(sum - k)) {
                res += count.get(sum - k);
            }
            int add = 1;
            if (count.containsKey(sum)) {
                add += count.get(sum);
            }
            count.put(sum, add);
        }
        return res;
    }
}
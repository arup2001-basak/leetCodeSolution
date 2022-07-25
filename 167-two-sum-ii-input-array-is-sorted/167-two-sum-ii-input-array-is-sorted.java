class Solution {
    public int[] twoSum(int[] numbers, int target) {
       HashMap <Integer, Integer> map = new HashMap();
        for(int i = 0; i<numbers.length; i++){
            map.put(numbers[i], i);
        }
        
        for(int i = 0; i<numbers.length; i++){
            int num = numbers[i];
            int rem = target - num;
            if(map.containsKey(rem) && map.get(rem) != i){
                int index = map.get(rem);
                return new int[]{i+1,index+1};
            }
        }
           return new int[]{};
    }
}
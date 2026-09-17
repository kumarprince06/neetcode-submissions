class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            // for(int j = i+1; j < nums.length; j++ ){
            //     if(nums[i] == nums[j]) return true;
            // }
            if(hash.contains(nums[i])){
                return true;
            }else{
                hash.add(nums[i]);
            }
        }

        return false;
    }
}
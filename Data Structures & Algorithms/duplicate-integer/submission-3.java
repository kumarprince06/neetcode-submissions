class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int num : nums){
            // for(int j = i+1; j < nums.length; j++ ){
            //     if(nums[i] == nums[j]) return true;
            // }
            if(hash.contains(num)){
                return true;
            }

            hash.add(num);
            
        }

        return false;
    }
}
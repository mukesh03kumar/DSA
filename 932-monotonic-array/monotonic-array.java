class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incArray = true;
        boolean decArray = true;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                incArray = false;
            }

            if(nums[i] < nums[i+1]){
                decArray = false;
            }
        }

        return incArray || decArray;
    }
}
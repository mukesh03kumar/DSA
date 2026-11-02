class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int heigh = 1;
        int k = 1;

        while(heigh < nums.length){
            if(nums[low] == nums[heigh]){
                heigh++;
                continue;
            }
            nums[low+1] = nums[heigh];
            low++;
            heigh++;
            k++;
        }
        return k;
    }
}
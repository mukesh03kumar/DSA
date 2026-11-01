class Solution {
    public int splitArray(int[] nums, int k) {
        int maxVal = nums[0];      //this will store the max value when all elements are single
        int sum = nums[0];       //this will store the total sum of the array with no division
        for(int i=1; i<nums.length; i++){
            maxVal = Math.max(maxVal, nums[i]);
            sum += nums[i];
        }

        int low = maxVal, heigh = sum;
        int ans = 0;
        while(low <= heigh){
            // find mid 
            int mid = low + (heigh - low)/2;
            if(isValid(nums, mid, k)){
                ans = mid;
                heigh = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean isValid(int[] nums, int mid, int k){
        int count = 1;      //count trak the -> array split
        int sum = nums[0];      
        for(int i=1; i<nums.length; i++){
            sum += nums[i];
            if(sum > mid){
                sum = nums[i];
                count++;
            }
        }
        return count <= k;
    }
}
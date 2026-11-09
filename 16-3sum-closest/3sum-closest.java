class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;

        Arrays.sort(nums);
 
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);

                if(minDiff > diff){
                    minDiff = diff;
                    ans = sum;
                }

                if(sum == target){
                    left++;
                    right--;
                } else if(sum < target){
                    left++;
                } else{
                    right--;
                }
            }
        }

        return ans;
    }
}
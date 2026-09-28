class Solution {
    public int mostFrequent(int[] nums, int key) {
        int freqArray[] = new int[1001];
        int target = 0;
        int maxValue = 0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == key){
                freqArray[nums[i+1]]++;
            }
        }

        for(int i=0; i<freqArray.length; i++){
            if(freqArray[i] > maxValue){
                target = i;
                maxValue = freqArray[i];
            }
        }

        return target;
    }
}
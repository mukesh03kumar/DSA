class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr = 0;
        int prev = 0;
        int start = 0;

        for(int i=0; i<gas.length; i++){
            curr += gas[i];
            curr -= cost[i];

            if(curr < 0){
                prev += curr;
                start = i+1;
                curr = 0;
            }
        }

        return (curr + prev >= 0) ? start : -1;
    }
}
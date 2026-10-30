class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int sort[][] = new int[intervals.length][3];
        for(int i=0; i<intervals.length; i++){
            sort[i][0] = i;
            sort[i][1] = intervals[i][0];
            sort[i][2] = intervals[i][1];
        }

        Arrays.sort(sort, Comparator.comparingDouble(o -> o[2]));

        int minInterval = 0;
        int lastEnd = sort[0][2];
        for(int i=1; i<intervals.length; i++){
            if(sort[i][1] < lastEnd){
                minInterval++;
            }else{
                lastEnd = sort[i][2];
            }
        }

        return minInterval;
    }
}
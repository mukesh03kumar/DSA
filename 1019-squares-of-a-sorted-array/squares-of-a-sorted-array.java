class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> negNums = new ArrayList<>();
        ArrayList<Integer> posNums = new ArrayList<>();

        // separate negative and positive numbers
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                negNums.add(nums[i]);
            } else{
                posNums.add(nums[i]);
            }
        }

        // Square of negative numbers
        for(int i=0; i<negNums.size(); i++){
            negNums.set(i, negNums.get(i) * negNums.get(i));
        }

        Collections.reverse(negNums);

        // Square of positive numbers
        for(int i=0; i<posNums.size(); i++){
            posNums.set(i, posNums.get(i) * posNums.get(i));
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int idxN = 0;
        int idxP = 0;

        while(idxN < negNums.size() && idxP < posNums.size()){
            if(negNums.get(idxN) < posNums.get(idxP)){
                ans.add(negNums.get(idxN));
                idxN++;
            } else{
                ans.add(posNums.get(idxP));
                idxP++;
            }
        }

        while(idxN < negNums.size()){
            ans.add(negNums.get(idxN));
            idxN++;
        }

        while(idxP < posNums.size()){
            ans.add(posNums.get(idxP));
            idxP++;
        }

        int[] result = new int[ans.size()];

        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }

        return result;
    }
}
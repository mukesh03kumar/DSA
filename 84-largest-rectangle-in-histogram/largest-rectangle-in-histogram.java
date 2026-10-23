class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int NSR[] = new int[heights.length];
        int NSL[] = new int[heights.length];

        // find the next smaller element at right 
        for(int i=heights.length-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                NSR[i] = heights.length;
            } else{
                NSR[i] = stack.peek();
            }
            stack.push(i);
        }

        stack = new Stack<>();
        // find the next smaller at left
        for(int i=0; i<heights.length; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                NSL[i] = -1;
            } else{
                NSL[i] = stack.peek();
            }
            stack.push(i);
        }

        // calculate the area 
        int maxArea = 0;
        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = NSR[i] - NSL[i] - 1;
            int currArea = height*width;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}
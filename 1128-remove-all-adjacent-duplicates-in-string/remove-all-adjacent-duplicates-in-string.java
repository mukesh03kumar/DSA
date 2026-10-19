class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);

            if(st.isEmpty()){
                st.push(currChar);
            } else{
                if(st.peek() == currChar){
                    st.pop();
                } else{
                    st.push(currChar);
                }
            }
        }

        StringBuilder ans = new StringBuilder("");

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
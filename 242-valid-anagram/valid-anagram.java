class Solution {
    public boolean isAnagram(String s, String t) {
        // Check the strings are of same lenght
        if(s.length() != t.length()){
            return false;
        } else{
            // stroe the char in a char array 
            char s1[] = s.toCharArray();
            char t1[] = t.toCharArray();

            // Sort the array 
            Arrays.sort(s1);
            Arrays.sort(t1);

            // Compair both the arrays 
            if(Arrays.equals(s1, t1)){
                return true;
            }
        }
        return false;
    }
}
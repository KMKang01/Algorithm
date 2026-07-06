class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int prefixLength = is_prefix.length();
        
        if(prefixLength <= my_string.length()) {
            if(my_string.substring(0, prefixLength).equals(is_prefix)) answer = 1;
            else answer = 0;    
        }
        
        return answer;
    }
}
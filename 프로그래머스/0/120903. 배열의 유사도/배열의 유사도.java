class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
            for(String el2: s2) {
                for(String el1: s1) {
                    if(el2.equals(el1)) answer++;
                }
            }
        
        return answer;
    }
}
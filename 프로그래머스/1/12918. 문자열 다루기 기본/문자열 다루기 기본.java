class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(!(s.length() == 4 || s.length() == 6)) {
            return false;
        }
        
        for(String ch : s.split("")) {
            if(!ch.matches("[0-9]")) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}
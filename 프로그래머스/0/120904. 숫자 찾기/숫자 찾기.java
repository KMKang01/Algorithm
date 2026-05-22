class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = Integer.toString(num);
        String [] sArr = s.split("");
        for(int i = 0; i < s.length(); i++) {
            if(Integer.parseInt(sArr[i]) == k) {
                answer = i;
                break;
            }
        }
        
        return answer >= 0 ? answer+1: answer;
    }
}
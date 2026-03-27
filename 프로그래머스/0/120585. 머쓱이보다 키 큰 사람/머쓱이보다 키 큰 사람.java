class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int h : array){
            answer = height < h ? answer + 1 : answer;
        }
        return answer;
    }
}
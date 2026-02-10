class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean [] containNums = new boolean[10];
        for(int n: numbers){
            containNums[n] = true;
        }
        for(int i = 0; i < 10; i++) {
            answer += containNums[i] ? 0 : i;
        }
        
        
        return answer;
    }
}
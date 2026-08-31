class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int max = -1;
        int idx = 0;
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(max < emergency[j]) {
                    max = emergency[j];
                    idx = j;
                }    
            }
            emergency[idx] = -1;
            answer[idx] = i + 1;
            max = -1;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int n = arr.length;
        // Math.pow(2, i)
        int i = 0;
        while((int)Math.pow(2, i) < n) i++;
        answer = new int [(int)Math.pow(2, i)];
        
        for(int j = 0; j < arr.length; j++) {
            answer[j] = arr[j];
        }
        
        return answer;
    }
}
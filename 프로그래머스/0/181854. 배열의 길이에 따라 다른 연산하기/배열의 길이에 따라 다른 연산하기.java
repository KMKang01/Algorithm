import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        for(int i = 0; i< arr.length; i++) {
            if(arr.length % 2 == 0 && i % 2 == 1) arr[i] += n;
            else if (arr.length % 2 == 1 && i % 2 == 0) arr[i] += n;
        }
        
        answer = Arrays.copyOf(arr, arr.length);
        return answer;
    }
}